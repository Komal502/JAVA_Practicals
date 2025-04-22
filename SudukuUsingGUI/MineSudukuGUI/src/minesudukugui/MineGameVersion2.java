/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minesudukugui;

import static minesudukugui.MineSuduku.gridSize;

/**
 *
 * @author komal
 */
public final  class MineGameVersion2{

    public String[][] layout;
	
	public int size;
    
	public MineGameVersion2(int size)
	{
		this.size=size;
		layout=new String[size][size];
		generateArray(layout);
	}
	public void getSolution()
	{
//            for(int i=0;i<size;i++)
//            {
//                for(int j=0;j<size;j++)
//                {
//                    layout[i][j]=ce
//                }
//            }
	}
	boolean isValidEntry(int row,int col,String input)
	{
		boolean isValid=true;
		for (int i = 0; i < size; i++) {
                        if((i!=col&& i!=row)&&Integer.parseInt(layout[row][i])>size ||Integer.parseInt(layout[col][i])>size ||Integer.parseInt(layout[row][i])<0)return false;
            		if (i != col && layout[row][i].equals(input)) return false;
                        if (i != row && layout[i][col].equals(input)) return false;

		}
		return isValid;
	}
	void generateArray(String[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{ 	
			int count=i+1;
			for(int j=0;j<arr.length;j++)
			{
				if(count==size+1)
				{
					count=1;
				}
				layout[i][j]=String.valueOf(count);
				count++;
			}
		}
		for(int i=0;i<size*size;i++)
		{
			int row=Math.abs((int)(System.nanoTime()%arr.length));
			int col=Math.abs((int)(System.nanoTime()%arr.length));
			layout[row][col]=" ";
		}
	}

	public static void main(String args[])
	{
	}
}
