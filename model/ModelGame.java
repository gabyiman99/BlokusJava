/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.FrameMain;
import view.PanelViewerPopUp;

/**
 *
 * @author Vic
 */
public class ModelGame {

    public static int size = 20;
    public static int[][] gameArray = new int[size][size]; // isinya representasi warna 1-4 tergantung player. 0 kosong
    public static int type = 0;
    public static int rotation = 0;
    public static boolean flip = false;
    public static int color = 1;
    public static boolean[][] isUsed = new boolean[21][4];

    public ModelGame() {
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray.length; j++) {
                gameArray[i][j] = 0;
            }
        }
    }

    public static void addBlockToModel(int x, int y) {
    	System.out.println("masuk addblockto model");
        int[][] coordinates = {};
        switch (type) {
            case 0:
                coordinates = new int[][]{
                    {x, y},
                    {x + 1, y},
                    {x + 2, y},
                    {x + 1, y + 1},
                    {x + 1, y + 2},};
                break;
            case 1:
                coordinates = new int[][]{
                    {x, y},
                    {x, y + 1},
                    {x, y + 2},
                    {x + 1, y + 2},};
                break;
            case 2: // I5
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y},
            		{x+3,y},
            		{x+4,y}
            	};
            	break;
            case 3: // I4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y},
            		{x+3,y}
            	};
            	break;
            case 4: // I3
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y}
            	};
            	break;
            case 5: // I2
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y}
            	};
            	break;
            case 6: // I1
            	coordinates = new int[][] {
            		{x,y}
            	};
            	break;
            case 7: // O4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x,y+1},
            		{x+1,y+1}
            	};
            	break;
            case 8: // T4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y},
            		{x+1,y+1}
            	};
            	break;
            case 9: // Z5
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+1,y+1},
            		{x+1,y+2},
            		{x+2,y+2}
            	};
            	break;
            case 10: // Y
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x,y+2},
            		{x,y+3}
            	};
            	break;
            case 11: // N
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x,y+2},
            		{x+1,y+2},
            		{x+1,y+3}
            	};
            	break;
            case 12: // P
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x, y+2}
            	};
            	break;
            case 13: // Z4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+1,y+1},
            		{x+2,y+1}
            	};
            	break;
            case 14: // V3
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x+1,y+1}
            	};
            	break;
            case 15: // U
            	coordinates = new int[][] {
            		{x,y},
            		{x+2,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+2,y+1}
            	};
            	break;
            case 16: // V5
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x,y+2},
            		{x+1,y+2},
            		{x+2,y+2}
            	};
            	break;
            case 17: // W
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+1,y+2},
            		{x+2,y+2}
            	};
            	break;
            case 18: // F
            	coordinates = new int[][] {
            		{x+1,y},
            		{x+2,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+1,y+2}
            	};
            	break;
            case 19: // X
            	coordinates = new int[][] {
            		{x+1,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+2,y+1},
            		{x+1,y+2}
            	};
            	break;
            case 20: // L5
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x,y+2},
            		{x,y+3},
            		{x+1,y+3}
            	};
            	break;
        }
        //rotate(coordinates);
        //coordinates = cobaRotate(coordinates);
        PanelViewerPopUp pVPU = new PanelViewerPopUp();
        pVPU.setCoordinates(coordinates);
        addIfValid(coordinates);
    }

    public static void rotate(int[][] coordinates) {
        for (int i = 0; i < rotation; i++) {
            for (int j = 0; j < coordinates.length; j++) {
                
            }
        }
        if (flip) {
            for (int i = 0; i < coordinates.length; i++) {
                
            }
        }
    }
    
    public static int[][] cobaRotate(int[][] coordinates) {
    	System.out.println("masuk rotate");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	for (int j = 0; j < 3; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			int a = coordinates[i][0]-x;
    			int b = coordinates[i][1]-y;
    			if(a==0) {
    				temp[i][0] = x-b;
    				temp[i][1] = y-a;
    			}else{
    				temp[i][0] = x-b;
    				temp[i][1] = y+a;
    			}
    		}
        	coordinates = temp;
		}
    	return coordinates;
    }

    public static void addIfValid(int[][] coordinates) {
        boolean isValid = true;

        // disable reuse
        if (isUsed[type][color-1]) {
            System.out.println("Don't reuse!");
            return;
        }
                
        // check out of bounds
        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i][0] == size || coordinates[i][0] < 0) {
                isValid = false;
                return;
            }
            if (coordinates[i][1] == size || coordinates[i][1] < 0) {
                isValid = false;
                return;
            }
        }

        // check collision
        for (int i = 0; i < coordinates.length; i++) {
            if (gameArray[coordinates[i][0]][coordinates[i][1]] != 0) {
                isValid = false;
                return;
            }
        }

        // check color side-by-side
        boolean sbsIsValid = false;
        for (int i = 0; i < coordinates.length; i++) {
//            System.out.print("Checking side: " + coordinates[i][0] + ", " + coordinates[i][1] + " - ");
            sbsIsValid = !checkSBS(coordinates[i][0], coordinates[i][1]);
//            System.out.println(sbsIsValid);
            if (!sbsIsValid) {
                return;
            }
        }

        // check corner
        boolean cornerIsValid = false;
        for (int i = 0; i < coordinates.length; i++) {
            cornerIsValid = checkCorner(coordinates[i][0], coordinates[i][1]);
            if (cornerIsValid) {
                break;
            }
        }
        if (!cornerIsValid) {
            isValid = false;
            return;
        }

        // apply to model
        if (isValid) {
            for (int i = 0; i < coordinates.length; i++) {
                try {
                    gameArray[coordinates[i][0]][coordinates[i][1]] = color;
                } catch (Exception e) {
                    System.out.println("Apply to model error");
                }
            }
            isUsed[type][color-1] = true;
            changeColor();
        }

    }

    public static void changeColor() {
        color++;
        if (color > 4) {
            color = 1;
        }
    }

    public static boolean checkCorner(int x, int y) {
        try {
            if ((x == 0 && y == 0) || (x == 0 && y == size - 1) || (x == size - 1 && y == 0) || (x == size - 1 && y == size - 1)) {
                return true;
            }
            if (gameArray[x + 1][y + 1] == color) {
            	System.out.println("masuk cek 2");
                return true;
            }
            if (gameArray[x - 1][y + 1] == color) {
            	System.out.println("masuk cek 3");
                return true;
            }

            if (gameArray[x + 1][y - 1] == color) {
            	System.out.println("masuk cek 4");
                return true;
            }

            if (gameArray[x - 1][y - 1] == color) {
            	System.out.println("masuk cek 5");
                return true;
            }
        } catch (Exception e) {
            System.out.print("[Check corner error]");
        }

        return false;
    }

    public static boolean checkSBS(int x, int y) {
        boolean sbs = false;
        try {
            if (gameArray[x + 1][y] == color) {
                sbs = true;
            }
            if (gameArray[x][y + 1] == color) {
                sbs = true;
            }

            if (gameArray[x][y - 1] == color) {
                sbs = true;
            }

            if (gameArray[x - 1][y] == color) {
                sbs = true;
            }
        } catch (Exception e) {
            System.out.print("[Check sbs error]");
        }

        return sbs;
    }

}
