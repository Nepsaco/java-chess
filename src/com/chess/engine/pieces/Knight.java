package com.chess.engine.pieces;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Knight extends Piece {

  private final static int[] CANDIDATE_MOVE_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17 };

  Knight(final int piecePosition, final Alliance pieceAlliance) {
    super(piecePosition, pieceAlliance);
  }

  @Override
  public List<Move> calculateLegalMoves(Board board) {

    int candidateDestinationCoordinate;
    final List<Move> legalMoves = new ArrayList<>();

    for(final int currentCandidate : CANDIDATE_MOVE_COORDINATES) {

      candidateDestinationCoordinate = this.piecePosition + currentCandidate;

        if(true){

          final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

          if(candidateDestinaionTile.isTileOccupied()) {
            legalMoves.add(new Move());
          } else {
            final Piece pieceAtDestination = candidateDestinationTile.getPiece();
            final Alliance pieceAlliance = pieceAtDestination;

            if(this.pieceAlliance != pieceAlliance) {
              legalMoves.add(new Move());
            }
          }
        }
    }

    return Collections.unmodifiableMap(legalMoves);
  }
}
