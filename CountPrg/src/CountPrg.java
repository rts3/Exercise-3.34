import javax.swing.JOptionPane;
public class CountPrg {
	public static void main(String[] args){
	int IChose, INumPeps,GpSz,INumPlay, TmSz;
	String Chose = JOptionPane.showInputDialog("Please choose which question to preform by entering 1 or 2");
	IChose = Integer.parseInt(Chose);
	if(IChose == 1){
		String NumPeps= JOptionPane.showInputDialog("Enter the number of people");
			INumPeps= Integer.parseInt(NumPeps);
			if(INumPeps >10){
				GpSz= INumPeps/2;
				JOptionPane.showMessageDialog(null,"The group size is " + GpSz);

			}else if(INumPeps>3){
				GpSz= INumPeps/3;
				JOptionPane.showMessageDialog(null,"The group size is " + GpSz);
			}else{
				JOptionPane.showMessageDialog(null,"The number of people must be greater than 3. Please try again");
			}
	
		}
	else if(IChose == 2){
		String NumPlay= JOptionPane.showInputDialog("Enter the number of players");
		INumPlay= Integer.parseInt(NumPlay);
		if(INumPlay >=11 && INumPlay<=55){
			 TmSz= INumPlay/2;
		}else{
			TmSz= 1;
			
		}
		JOptionPane.showMessageDialog(null,TmSz);

		}
	else{
		JOptionPane.showMessageDialog(null,"This is an nonexistent question. Please try again");
	}
	}
}
