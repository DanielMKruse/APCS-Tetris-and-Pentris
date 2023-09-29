
public class PieceData {

	
	//  T-PIECE
	private int[] TRot1x = new int[]{-1,0,1,0};
	private int[] TRot1y = new int[]{-1,-1,-1,1};
	private int[] TRot2x = new int[]{1,1,1,-1};
	private int[] TRot2y = new int[]{-1,0,1,0};
	private int[] TRot3x = new int[]{1,0,-1,0};
	private int[] TRot3y = new int[]{1,1,1,-1};
	private int[] TRot4x = new int[]{-1,-1,-1,1};
	private int[] TRot4y = new int[]{1,0,-1,0};
	
	//  U-PIECE
	private int[] URot1x = new int[]{-1,-1,1,1};
	private int[] URot1y = new int[]{1,0,0,1};
	private int[] URot2x = new int[]{-1,0,0,-1};
	private int[] URot2y = new int[]{1,1,-1,-1};
	private int[] URot3x = new int[]{-1,-1,1,1};
	private int[] URot3y = new int[]{-1,0,0,-1};
	private int[] URot4x = new int[]{1,0,0,1};
	private int[] URot4y = new int[]{-1,-1,1,1};
	
	//  X-PIECE (Doesn't rotate)
	private int[] XRot1x = new int[]{0,-1,1,0};
	private int[] XRot1y = new int[]{-1,0,0,1};
	
	//  I-PIECE
	private int[] IRot1x = new int[]{-2,-1,1,2};
	private int[] IRot1y = new int[]{0,0,0,0};
	private int[] IRot2x = new int[]{0,0,0,0};
	private int[] IRot2y = new int[]{-2,-1,1,2};
	
	//  JA-PIECE
	private int[] JARot1x = new int[]{-2,-1,1,1};
	private int[] JARot1y = new int[]{0,0,0,1};
	private int[] JARot2x = new int[]{0,0,0,-1};
	private int[] JARot2y = new int[]{-2,-1,1,1};
	private int[] JARot3x = new int[]{2,1,-1,-1};
	private int[] JARot3y = new int[]{0,0,0,-1};
	private int[] JARot4x = new int[]{0,0,0,1};
	private int[] JARot4y = new int[]{2,1,-1,-1};
	
	//  LA-PIECE
	private int[] LARot1x = new int[]{2,1,-1,-1};
	private int[] LARot1y = new int[]{0,0,0,1};
	private int[] LARot2x = new int[]{0,0,0,-1};
	private int[] LARot2y = new int[]{2,1,-1,-1};
	private int[] LARot3x = new int[]{-2,-1,1,1};
	private int[] LARot3y = new int[]{0,0,0,-1};
	private int[] LARot4x = new int[]{0,0,0,1};
	private int[] LARot4y = new int[]{-2,-1,1,1};
	
	//  R-PIECE
	private int[] RRot1x = new int[]{-2,-1,0,1};
	private int[] RRot1y = new int[]{0,0,1,0};
	private int[] RRot2x = new int[]{0,0,-1,0};
	private int[] RRot2y = new int[]{-2,-1,0,1};
	private int[] RRot3x = new int[]{2,1,0,-1};
	private int[] RRot3y = new int[]{0,0,-1,0};
	private int[] RRot4x = new int[]{0,0,1,0};
	private int[] RRot4y = new int[]{2,1,0,-1};
	
	//  Y-PIECE
	private int[] YRot1x = new int[]{2,1,0,-1};
	private int[] YRot1y = new int[]{0,0,1,0};
	private int[] YRot2x = new int[]{0,0,-1,0};
	private int[] YRot2y = new int[]{2,1,0,-1};
	private int[] YRot3x = new int[]{-2,1,0,-1};
	private int[] YRot3y = new int[]{0,0,-1,0};
	private int[] YRot4x = new int[]{0,0,1,0};
	private int[] YRot4y = new int[]{-2,-1,0,1};
	
	//  SA-PIECE
	private int[] SARot1x = new int[]{-2,-1,0,1};
	private int[] SARot1y = new int[]{0,0,1,1};
	private int[] SARot2x = new int[]{0,0,-1,-1};
	private int[] SARot2y = new int[]{-2,-1,0,1};
	private int[] SARot3x = new int[]{2,1,0,-1};
	private int[] SARot3y = new int[]{0,0,-1,-1};
	private int[] SARot4x = new int[]{0,0,1,1};
	private int[] SARot4y = new int[]{2,1,0,-1};
	
	//  ZA-PIECE
	private int[] ZARot1x = new int[]{2,1,0,-1};
	private int[] ZARot1y = new int[]{0,0,1,1};
	private int[] ZARot2x = new int[]{0,0,-1,-1};
	private int[] ZARot2y = new int[]{2,1,0,-1};
	private int[] ZARot3x = new int[]{-2,-1,0,1};
	private int[] ZARot3y = new int[]{0,0,-1,-1};
	private int[] ZARot4x = new int[]{0,0,1,1};
	private int[] ZARot4y = new int[]{-2,-1,0,1};
	
	//  Q-PIECE
	private int[] QRot1x = new int[]{-1,-1,0,1};
	private int[] QRot1y = new int[]{0,1,1,0};
	private int[] QRot2x = new int[]{0,-1,-1,0};
	private int[] QRot2y = new int[]{-1,-1,0,1};
	private int[] QRot3x = new int[]{1,1,0,-1};
	private int[] QRot3y = new int[]{0,-1,-1,0};
	private int[] QRot4x = new int[]{0,1,1,0};
	private int[] QRot4y = new int[]{1,1,0,-1};
	
	//  P-PIECE
	private int[] PRot1x = new int[]{1,1,0,-1};
	private int[] PRot1y = new int[]{0,1,1,0};
	private int[] PRot2x = new int[]{0,-1,-1,0};
	private int[] PRot2y = new int[]{1,1,0,-1};
	private int[] PRot3x = new int[]{-1,-1,0,1};
	private int[] PRot3y = new int[]{0,-1,-1,0};
	private int[] PRot4x = new int[]{0,1,1,0};
	private int[] PRot4y = new int[]{-1,-1,0,1};
	
	//  F-PIECE
	private int[] FRot1x = new int[]{-1,0,1,1};
	private int[] FRot1y = new int[]{0,1,0,-1};
	private int[] FRot2x = new int[]{0,-1,0,1};
	private int[] FRot2y = new int[]{-1,0,1,1};
	private int[] FRot3x = new int[]{1,0,-1,-1};
	private int[] FRot3y = new int[]{0,-1,0,1};
	private int[] FRot4x = new int[]{0,1,0,-1};
	private int[] FRot4y = new int[]{1,0,-1,-1};
	
	//  FD-PIECE
	private int[] FDRot1x = new int[]{1,0,-1,-1};
	private int[] FDRot1y = new int[]{0,1,0,-1};
	private int[] FDRot2x = new int[]{0,-1,0,1};
	private int[] FDRot2y = new int[]{1,0,-1,-1};
	private int[] FDRot3x = new int[]{-1,0,1,1};
	private int[] FDRot3y = new int[]{0,-1,0,1};
	private int[] FDRot4x = new int[]{0,1,0,-1};
	private int[] FDRot4y = new int[]{-1,0,1,1};
	
	//  ZB-PIECE
	private int[] ZBRot1x = new int[]{-1,0,0,1};
	private int[] ZBRot1y = new int[]{1,1,-1,-1};
	private int[] ZBRot2x = new int[]{-1,-1,1,1};
	private int[] ZBRot2y = new int[]{-1,0,0,1};
	
	//  SB-PIECE
	private int[] SBRot1x = new int[]{-1,0,0,1};
	private int[] SBRot1y = new int[]{-1,-1,1,1};
	private int[] SBRot2x = new int[]{1,1,-1,-1};
	private int[] SBRot2y = new int[]{-1,0,0,1};
	
	//  W-PIECE
	private int[] WRot1x = new int[]{-1,0,1,1};
	private int[] WRot1y = new int[]{1,1,0,-1};
	private int[] WRot2x = new int[]{-1,-1,0,1};
	private int[] WRot2y = new int[]{-1,0,1,1};
	private int[] WRot3x = new int[]{1,0,-1,-1};
	private int[] WRot3y = new int[]{-1,-1,0,1};
	private int[] WRot4x = new int[]{1,1,0,-1};
	private int[] WRot4y = new int[]{1,0,-1,-1};
	
	//LJ-PIECE
	private int[] LJRot1x = new int[]{2,1,0,0};
	private int[] LJRot1y = new int[]{0,0,1,2};
	private int[] LJRot2x = new int[]{0,0,-1,-2};
	private int[] LJRot2y = new int[]{2,1,0,0};
	private int[] LJRot3x = new int[]{-2,-1,0,0};
	private int[] LJRot3y = new int[]{0,0,-1,-2};
	private int[] LJRot4x = new int[]{0,0,1,2};
	private int[] LJRot4y = new int[]{-2,-1,0,0};
	
	
	
	private int next;
	
	
	public int[] getRotationX(int x, int pieceID, int rotationState) {
		
		int[] build;
		
		if(pieceID == 0) {
		if(rotationState % 4 == 1) {
			build = new int[]{x + TRot1x[0],x + TRot1x[1],x + TRot1x[2],x + TRot1x[3]};

			return build;
		}
		if(rotationState % 4 == 2) {
			build = new int[]{x + TRot2x[0],x + TRot2x[1],x + TRot2x[2],x + TRot2x[3]};

			return build;
		}
		if(rotationState % 4 == 3) {
			build = new int[]{x + TRot3x[0],x + TRot3x[1],x + TRot3x[2],x + TRot3x[3]};

			return build;
		}
		if(rotationState % 4 == 0) {
			build = new int[]{x + TRot4x[0],x + TRot4x[1],x + TRot4x[2],x + TRot4x[3]};

			return build;
		}
		}
		
		if(pieceID == 1) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + URot1x[0],x + URot1x[1],x + URot1x[2],x + URot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + URot2x[0],x + URot2x[1],x + URot2x[2],x + URot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + URot3x[0],x + URot3x[1],x + URot3x[2],x + URot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + URot4x[0],x + URot4x[1],x + URot4x[2],x + URot4x[3]};

				return build;
			}
			}
		
		if(pieceID == 2) {
			
				build = new int[]{x + XRot1x[0],x + XRot1x[1],x + XRot1x[2],x + XRot1x[3]};

				return build;
			
			}
		if(pieceID == 3) {
			if(rotationState % 2 == 1) {
				build = new int[]{x + IRot1x[0],x + IRot1x[1],x + IRot1x[2],x + IRot1x[3]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{x + IRot2x[0],x + IRot2x[1],x + IRot2x[2],x + IRot2x[3]};

				return build;
			}
			}
		
		if(pieceID == 4) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + JARot1x[0],x + JARot1x[1],x + JARot1x[2],x + JARot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + JARot2x[0],x + JARot2x[1],x + JARot2x[2],x + JARot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + JARot3x[0],x + JARot3x[1],x + JARot3x[2],x + JARot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + JARot4x[0],x + JARot4x[1],x + JARot4x[2],x + JARot4x[3]};

				return build;
			}
			}
		if(pieceID == 5) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + LARot1x[0],x + LARot1x[1],x + LARot1x[2],x + LARot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + LARot2x[0],x + LARot2x[1],x + LARot2x[2],x + LARot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + LARot3x[0],x + LARot3x[1],x + LARot3x[2],x + LARot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + LARot4x[0],x + LARot4x[1],x + LARot4x[2],x + LARot4x[3]};

				return build;
			}
			}
		if(pieceID == 6) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + RRot1x[0],x + RRot1x[1],x + RRot1x[2],x + RRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + RRot2x[0],x + RRot2x[1],x + RRot2x[2],x + RRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + RRot3x[0],x + RRot3x[1],x + RRot3x[2],x + RRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + RRot4x[0],x + RRot4x[1],x + RRot4x[2],x + RRot4x[3]};

				return build;
			}
			}
		if(pieceID == 7) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + YRot1x[0],x + YRot1x[1],x + YRot1x[2],x + YRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + YRot2x[0],x + YRot2x[1],x + YRot2x[2],x + YRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + YRot3x[0],x + YRot3x[1],x + YRot3x[2],x + YRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + YRot4x[0],x + YRot4x[1],x + YRot4x[2],x + YRot4x[3]};

				return build;
			}
			}
		if(pieceID == 8) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + SARot1x[0],x + SARot1x[1],x + SARot1x[2],x + SARot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + SARot2x[0],x + SARot2x[1],x + SARot2x[2],x + SARot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + SARot3x[0],x + SARot3x[1],x + SARot3x[2],x + SARot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + SARot4x[0],x + SARot4x[1],x + SARot4x[2],x + SARot4x[3]};

				return build;
			}
			}
		if(pieceID == 9) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + ZARot1x[0],x + ZARot1x[1],x + ZARot1x[2],x + ZARot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + ZARot2x[0],x + ZARot2x[1],x + ZARot2x[2],x + ZARot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + ZARot3x[0],x + ZARot3x[1],x + ZARot3x[2],x + ZARot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + ZARot4x[0],x + ZARot4x[1],x + ZARot4x[2],x + ZARot4x[3]};

				return build;
			}
			}
		if(pieceID == 10) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + QRot1x[0],x + QRot1x[1],x + QRot1x[2],x + QRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + QRot2x[0],x + QRot2x[1],x + QRot2x[2],x + QRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + QRot3x[0],x + QRot3x[1],x + QRot3x[2],x + QRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + QRot4x[0],x + QRot4x[1],x + QRot4x[2],x + QRot4x[3]};

				return build;
			}
			}
		if(pieceID == 11) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + PRot1x[0],x + PRot1x[1],x + PRot1x[2],x + PRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + PRot2x[0],x + PRot2x[1],x + PRot2x[2],x + PRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + PRot3x[0],x + PRot3x[1],x + PRot3x[2],x + PRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + PRot4x[0],x + PRot4x[1],x + PRot4x[2],x + PRot4x[3]};

				return build;
			}
			}
		if(pieceID == 12) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + FRot1x[0],x + FRot1x[1],x + FRot1x[2],x + FRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + FRot2x[0],x + FRot2x[1],x + FRot2x[2],x + FRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + FRot3x[0],x + FRot3x[1],x + FRot3x[2],x + FRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + FRot4x[0],x + FRot4x[1],x + FRot4x[2],x + FRot4x[3]};

				return build;
			}
			}
		if(pieceID == 13) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + FDRot1x[0],x + FDRot1x[1],x + FDRot1x[2],x + FDRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + FDRot2x[0],x + FDRot2x[1],x + FDRot2x[2],x + FDRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + FDRot3x[0],x + FDRot3x[1],x + FDRot3x[2],x + FDRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + FDRot4x[0],x + FDRot4x[1],x + FDRot4x[2],x + FDRot4x[3]};

				return build;
			}
			}
		
		if(pieceID == 14) {
			if(rotationState % 2 == 1) {
				build = new int[]{x + ZBRot1x[0],x + ZBRot1x[1],x + ZBRot1x[2],x + ZBRot1x[3]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{x + ZBRot2x[0],x + ZBRot2x[1],x + ZBRot2x[2],x + ZBRot2x[3]};

				return build;
			}
			}
		if(pieceID == 15) {
			if(rotationState % 2 == 1) {
				build = new int[]{x + SBRot1x[0],x + SBRot1x[1],x + SBRot1x[2],x + SBRot1x[3]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{x + SBRot2x[0],x + SBRot2x[1],x + SBRot2x[2],x + SBRot2x[3]};

				return build;
			}
			}
		if(pieceID == 16) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + WRot1x[0],x + WRot1x[1],x + WRot1x[2],x + WRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + WRot2x[0],x + WRot2x[1],x + WRot2x[2],x + WRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + WRot3x[0],x + WRot3x[1],x + WRot3x[2],x + WRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + WRot4x[0],x + WRot4x[1],x + WRot4x[2],x + WRot4x[3]};

				return build;
			}
			}
		if(pieceID == 17) {
			if(rotationState % 4 == 1) {
				build = new int[]{x + LJRot1x[0],x + LJRot1x[1],x + LJRot1x[2],x + LJRot1x[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{x + LJRot2x[0],x + LJRot2x[1],x + LJRot2x[2],x + LJRot2x[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{x + LJRot3x[0],x + LJRot3x[1],x + LJRot3x[2],x + LJRot3x[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{x + LJRot4x[0],x + LJRot4x[1],x + LJRot4x[2],x + LJRot4x[3]};

				return build;
			}
			}
		
		return null;
		

		
	}
	
	public int[] getRotationY(int y, int pieceID, int rotationState) {
		
		int[] build;
		
		if(pieceID == 0) {
		if(rotationState % 4 == 1) {
			build = new int[]{y + TRot1y[0],y + TRot1y[1],y + TRot1y[2],y + TRot1y[3]};

			return build;
		}
		if(rotationState % 4 == 2) {
			build = new int[]{y + TRot2y[0],y + TRot2y[1],y + TRot2y[2],y + TRot2y[3]};

			return build;
		}
		if(rotationState % 4 == 3) {
			build = new int[]{y + TRot3y[0],y + TRot3y[1],y + TRot3y[2],y + TRot3y[3]};

			return build;
		}
		if(rotationState % 4 == 0) {
			build = new int[]{y + TRot4y[0],y + TRot4y[1],y + TRot4y[2],y + TRot4y[3]};

			return build;
		}
		}
		
		if(pieceID == 1) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + URot1y[0],y + URot1y[1],y + URot1y[2],y + URot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + URot2y[0],y + URot2y[1],y + URot2y[2],y + URot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y + URot3y[0],y + URot3y[1],y + URot3y[2],y + URot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y + URot4y[0],y + URot4y[1],y + URot4y[2],y + URot4y[3]};

				return build;
			}
			}
		
		if(pieceID == 2) {
			
			build = new int[]{y + XRot1y[0],y + XRot1y[1],y + XRot1y[2],y + XRot1y[3]};

			return build;
		
		}
		
		if(pieceID == 3) {
			if(rotationState % 2 == 1) {
				build = new int[]{y + IRot1y[0],y + IRot1y[1],y + IRot1y[2],y + IRot1y[3]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{y + IRot2y[0],y + IRot2y[1],y + IRot2y[2],y + IRot2y[3]};

				return build;
			}
			}
		
		if(pieceID == 4) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + JARot1y[0],y + JARot1y[1],y + JARot1y[2],y + JARot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + JARot2y[0],y + JARot2y[1],y + JARot2y[2],y + JARot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ JARot3y[0],y + JARot3y[1],y + JARot3y[2],y + JARot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ JARot4y[0],y + JARot4y[1],y + JARot4y[2],y + JARot4y[3]};

				return build;
			}
			}
		if(pieceID == 5) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + LARot1y[0],y + LARot1y[1],y + LARot1y[2],y + LARot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + LARot2y[0],y + LARot2y[1],y + LARot2y[2],y + LARot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ LARot3y[0],y + LARot3y[1],y + LARot3y[2],y + LARot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ LARot4y[0],y + LARot4y[1],y + LARot4y[2],y + LARot4y[3]};

				return build;
			}
			}
		if(pieceID == 6) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + RRot1y[0],y + RRot1y[1],y + RRot1y[2],y + RRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + RRot2y[0],y + RRot2y[1],y + RRot2y[2],y + RRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ RRot3y[0],y + RRot3y[1],y + RRot3y[2],y + RRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ RRot4y[0],y + RRot4y[1],y + RRot4y[2],y + RRot4y[3]};

				return build;
			}
			}
		if(pieceID == 7) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + YRot1y[0],y + YRot1y[1],y + YRot1y[2],y + YRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + YRot2y[0],y + YRot2y[1],y + YRot2y[2],y + YRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ YRot3y[0],y + YRot3y[1],y + YRot3y[2],y + YRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ YRot4y[0],y + YRot4y[1],y + YRot4y[2],y + YRot4y[3]};

				return build;
			}
			}
		if(pieceID == 8) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + SARot1y[0],y + SARot1y[1],y + SARot1y[2],y + SARot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + SARot2y[0],y + SARot2y[1],y + SARot2y[2],y + SARot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ SARot3y[0],y + SARot3y[1],y + SARot3y[2],y + SARot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ SARot4y[0],y + SARot4y[1],y + SARot4y[2],y + SARot4y[3]};

				return build;
			}
			}
		if(pieceID == 9) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + ZARot1y[0],y + ZARot1y[1],y + ZARot1y[2],y + ZARot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + ZARot2y[0],y + ZARot2y[1],y + ZARot2y[2],y + ZARot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ ZARot3y[0],y + ZARot3y[1],y + ZARot3y[2],y + ZARot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ ZARot4y[0],y + ZARot4y[1],y + ZARot4y[2],y + ZARot4y[3]};

				return build;
			}
			}
		if(pieceID == 10) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + QRot1y[0],y + QRot1y[1],y + QRot1y[2],y + QRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + QRot2y[0],y + QRot2y[1],y + QRot2y[2],y + QRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ QRot3y[0],y + QRot3y[1],y + QRot3y[2],y + QRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ QRot4y[0],y + QRot4y[1],y + QRot4y[2],y + QRot4y[3]};

				return build;
			}
			}
		if(pieceID == 11) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + PRot1y[0],y + PRot1y[1],y + PRot1y[2],y + PRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + PRot2y[0],y + PRot2y[1],y + PRot2y[2],y + PRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ PRot3y[0],y + PRot3y[1],y + PRot3y[2],y + PRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ PRot4y[0],y + PRot4y[1],y + PRot4y[2],y + PRot4y[3]};

				return build;
			}
			}
		if(pieceID == 12) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + FRot1y[0],y + FRot1y[1],y +FRot1y[2],y + FRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + FRot2y[0],y + FRot2y[1],y + FRot2y[2],y + FRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ FRot3y[0],y + FRot3y[1],y + FRot3y[2],y + FRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ FRot4y[0],y + FRot4y[1],y + FRot4y[2],y + FRot4y[3]};

				return build;
			}
			}
		if(pieceID == 13) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + FDRot1y[0],y + FDRot1y[1],y +FDRot1y[2],y + FDRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + FDRot2y[0],y + FDRot2y[1],y + FDRot2y[2],y + FDRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ FDRot3y[0],y + FDRot3y[1],y + FDRot3y[2],y + FDRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ FDRot4y[0],y + FDRot4y[1],y + FDRot4y[2],y + FDRot4y[3]};

				return build;
			}
			}
		if(pieceID == 14) {
			if(rotationState % 2 == 1) {
				build = new int[]{y + ZBRot1y[0],y + ZBRot1y[1],y + ZBRot1y[2],y + ZBRot1y[3]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{y + ZBRot2y[0],y + ZBRot2y[1],y + ZBRot2y[2],y + ZBRot2y[3]};

				return build;
			}
			}
		if(pieceID == 15) {
			if(rotationState % 2 == 1) {
				build = new int[]{y + SBRot1y[0],y + SBRot1y[1],y + SBRot1y[2],y + SBRot1y[3]};

				return build;
			}
			if(rotationState % 2 == 0) {
				build = new int[]{y + SBRot2y[0],y + SBRot2y[1],y + SBRot2y[2],y + SBRot2y[3]};

				return build;
			}
			}
		if(pieceID == 16) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + WRot1y[0],y + WRot1y[1],y + WRot1y[2],y + WRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + WRot2y[0],y + WRot2y[1],y + WRot2y[2],y + WRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ WRot3y[0],y + WRot3y[1],y + WRot3y[2],y + WRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ WRot4y[0],y + WRot4y[1],y + WRot4y[2],y + WRot4y[3]};

				return build;
			}
			}
		if(pieceID == 17) {
			if(rotationState % 4 == 1) {
				build = new int[]{y + LJRot1y[0],y + LJRot1y[1],y + LJRot1y[2],y + LJRot1y[3]};

				return build;
			}
			if(rotationState % 4 == 2) {
				build = new int[]{y + LJRot2y[0],y + LJRot2y[1],y + LJRot2y[2],y + LJRot2y[3]};

				return build;
			}
			if(rotationState % 4 == 3) {
				build = new int[]{y+ LJRot3y[0],y + LJRot3y[1],y + LJRot3y[2],y + LJRot3y[3]};

				return build;
			}
			if(rotationState % 4 == 0) {
				build = new int[]{y+ LJRot4y[0],y + LJRot4y[1],y + LJRot4y[2],y + LJRot4y[3]};

				return build;
			}
			}

		return null;
		
		
	}
	
	
	public void setNext() {
		
		
		next = (int) (Math.random() * 18);
		
		
	}
	
	public int getNext() {
		
		
		return next;
		
		
	}
	
	
	
	
	
	
	
}
