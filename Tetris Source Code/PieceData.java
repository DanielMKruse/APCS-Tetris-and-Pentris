
public class PieceData {

	//   J-PIECE
	private int[] JRot1x = new int[]{-1, 1, 1};
	private int[] JRot1y = new int[]{0, 0, 1};
	private int[] JRot2x = new int[]{0, 0, -1};
	private int[] JRot2y = new int[]{-1, 1, 1};
	private int[] JRot3x = new int[]{1, -1, -1};
	private int[] JRot3y = new int[]{0, 0, -1};
	private int[] JRot4x = new int[]{0, 0, 1};
	private int[] JRot4y = new int[]{1, -1, -1};
	
	//  L-PIECE
	private int[] LRot1x = new int[]{-1, -1, 1};
	private int[] LRot1y = new int[]{1,0,0};
	private int[] LRot2x = new int[]{-1,0,0};
	private int[] LRot2y = new int[]{-1,-1,1};
	private int[] LRot3x = new int[]{1,1,-1};
	private int[] LRot3y = new int[]{-1,0,0};
	private int[] LRot4x = new int[]{1,0,0};
	private int[] LRot4y = new int[]{1,1,-1};
	
	//  Z-PIECE
	private int[] ZRot1x = new int[]{-1,0,1};
	private int[] ZRot1y = new int[]{0,1,1};
	private int[] ZRot2x = new int[]{0,1,1};
	private int[] ZRot2y = new int[]{1,0,-1};
	
	//  S-PIECE
	private int[] SRot1x = new int[]{-1,0,1};
	private int[] SRot1y = new int[]{1,1,0};
	private int[] SRot2x = new int[]{1,1,0};
	private int[] SRot2y = new int[]{1,0,-1};
	
	//  O-PIECE (Doesn't rotate)
	private int[] ORot1x = new int[]{-1,-1,0};
	private int[] ORot1y = new int[]{0,1,1};
	
	//  T-PIECE
	private int[] TRot1x = new int[]{-1,0,1};
	private int[] TRot1y = new int[]{0,1,0};
	private int[] TRot2x = new int[]{0,-1,0};
	private int[] TRot2y = new int[]{-1,0,1};
	private int[] TRot3x = new int[]{1,0,-1};
	private int[] TRot3y = new int[]{0,-1,0};
	private int[] TRot4x = new int[]{0,1,0};
	private int[] TRot4y = new int[]{1,0,-1};
	
	//  I-PIECE
	private int[] IRot1x = new int[]{-2,-1,1};
	private int[] IRot1y = new int[]{0,0,0};
	private int[] IRot2x = new int[]{0,0,0};
	private int[] IRot2y = new int[]{-2,-1,1};
	
	private int next;
	
	
	public int[] getRotationX(int x, int pieceID, int rotationState) {
		
		int[] build;
		
		if(pieceID == 0) {
		if(rotationState % 4 == 1) {
			build = new int[]{x + JRot1x[0],x + JRot1x[1],x + JRot1x[2]};

			return build;
		}
		if(rotationState % 4 == 2) {
			build = new int[]{x + JRot2x[0],x + JRot2x[1],x + JRot2x[2]};

			return build;
		}
		if(rotationState % 4 == 3) {
			build = new int[]{x + JRot3x[0],x + JRot3x[1],x + JRot3x[2]};

			return build;
		}
		if(rotationState % 4 == 0) {
			build = new int[]{x + JRot4x[0],x + JRot4x[1],x + JRot4x[2]};

			return build;
		}
		}
		
		if(pieceID == 1) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + LRot1x[0],x + LRot1x[1],x + LRot1x[2]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + LRot2x[0],x + LRot2x[1],x + LRot2x[2]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + LRot3x[0],x + LRot3x[1],x + LRot3x[2]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + LRot4x[0],x + LRot4x[1],x + LRot4x[2]};

				return build;
			}
			}
		if(pieceID == 2) {
			if(rotationState % 2 == 1) {
				build = new int[]{x + ZRot1x[0],x + ZRot1x[1],x + ZRot1x[2]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{x + ZRot2x[0],x + ZRot2x[1],x + ZRot2x[2]};

				return build;
			}
			}
		if(pieceID == 3) {
			if(rotationState % 2 == 1) {
				build = new int[]{x + SRot1x[0],x + SRot1x[1],x + SRot1x[2]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{x + SRot2x[0],x + SRot2x[1],x + SRot2x[2]};

				return build;
			}
			}
		if(pieceID == 4) {
			
				build = new int[]{x + ORot1x[0],x + ORot1x[1],x + ORot1x[2]};

				return build;
			
			}
		if(pieceID == 5) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + TRot1x[0],x + TRot1x[1],x + TRot1x[2]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + TRot2x[0],x + TRot2x[1],x + TRot2x[2]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + TRot3x[0],x + TRot3x[1],x + TRot3x[2]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + TRot4x[0],x + TRot4x[1],x + TRot4x[2]};

				return build;
			}
			}
		if(pieceID == 6) {
			if(rotationState % 2 == 1) {
				build = new int[]{x + IRot1x[0],x + IRot1x[1],x + IRot1x[2]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{x + IRot2x[0],x + IRot2x[1],x + IRot2x[2]};

				return build;
			}
			}
		
		return null;
		

		
	}
	
	public int[] getRotationY(int y, int pieceID, int rotationState) {
		
		int[] build;
		
		if(pieceID == 0) {
		if(rotationState % 4 == 1) {
			build = new int[]{y + JRot1y[0],y + JRot1y[1],y + JRot1y[2]};

			return build;
		}
		if(rotationState % 4 == 2) {
			build = new int[]{y + JRot2y[0],y + JRot2y[1],y + JRot2y[2]};

			return build;
		}
		if(rotationState % 4 == 3) {
			build = new int[]{y + JRot3y[0],y + JRot3y[1],y + JRot3y[2]};

			return build;
		}
		if(rotationState % 4 == 0) {
			build = new int[]{y + JRot4y[0],y + JRot4y[1],y + JRot4y[2]};

			return build;
		}
		}
		if(pieceID == 1) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + LRot1y[0],y + LRot1y[1],y + LRot1y[2]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + LRot2y[0],y + LRot2y[1],y + LRot2y[2]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y + LRot3y[0],y + LRot3y[1],y + LRot3y[2]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y + LRot4y[0],y + LRot4y[1],y + LRot4y[2]};

				return build;
			}
			}
		if(pieceID == 2) {
			if(rotationState % 2 == 1) {
				build = new int[]{y + ZRot1y[0],y + ZRot1y[1],y + ZRot1y[2]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{y + ZRot2y[0],y + ZRot2y[1],y + ZRot2y[2]};

				return build;
			}
			}
		if(pieceID == 3) {
			if(rotationState % 2 == 1) {
				build = new int[]{y + SRot1y[0],y + SRot1y[1],y + SRot1y[2]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{y + SRot2y[0],y + SRot2y[1],y + SRot2y[2]};

				return build;
			}
			}
		if(pieceID == 4) {
			
			build = new int[]{y + ORot1y[0],y + ORot1y[1],y + ORot1y[2]};

			return build;
		
		}
		if(pieceID == 5) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + TRot1y[0],y + TRot1y[1],y + TRot1y[2]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + TRot2y[0],y + TRot2y[1],y + TRot2y[2]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y + TRot3y[0],y + TRot3y[1],y + TRot3y[2]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y + TRot4y[0],y + TRot4y[1],y + TRot4y[2]};

				return build;
			}
			}
		if(pieceID == 6) {
			if(rotationState % 2 == 1) {
				build = new int[]{y + IRot1y[0],y + IRot1y[1],y + IRot1y[2]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{y + IRot2y[0],y + IRot2y[1],y + IRot2y[2]};

				return build;
			}
			}

		return null;
		
		
	}
	
	
	public void setNext() {
		
		
		next = (int) (Math.random() * 7);
		
		
	}
	
	public int getNext() {
		
		
		return next;
		
		
	}
	
	
	
	
	
	
	
}
