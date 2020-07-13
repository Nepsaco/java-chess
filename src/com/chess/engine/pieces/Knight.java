package com.chess.engine.pieces;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.List;

public class Knight extends Piece {

  private final static int[] CANDIDATE_MOVE_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17 };

  Knight(final int piecePostion, final Alliance pieceAlliance) {
    super(piecePosition, pieceAlliance);
  }

  @Override
  public List<Move> calculateLegalMoves(Board board) {

    int candidateDestinationCoordinate;

    for(final int currentCandidate : CANDIDATE_MOVE_COORDINATES) {
      candidateDestinationCoordinate = this.piecePostion + currentCandidate;
        if(true){
          final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);
        }
      if(candidateDestinaionTile.isTileOccupied()) {

      }
    }

    return null
  }
}
