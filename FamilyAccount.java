/*
	-----------家庭收支记账软件----------
	
				1. 收支明细
				2. 登记收入
				3. 登记支出
				4. 退出
				
				请选择(1-4): //获取键盘输入
	
*/
import java.util.Scanner;
public class FamilyAccount_1{
	private static double balance = 11000;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String details = "收支\t账户金额\t收支金额\t说明\n";
		boolean flag = true;
		while(flag){
			System.out.println("----家庭收支记账软件----");
			System.out.println("\t1. 收支明细\n\t2. 登记收入\n\t3. 登记支出\n\t4. 退出");
			System.out.print("\n\t请选择(1-4):");
			int input = sc.nextInt();
			switch(input){
				case 1:
					System.out.println("----当前收支明细记录----");
					System.out.println(details);
					System.out.println("------------------------");
					break;
				case 2:
					System.out.print("本次收入金额: ");
					int come = sc.nextInt();
					System.out.print("本次收入说明: ");
					String comeDetails = sc.next();
					balance += come;
					details += "收入\t"+balance+"\t\t"+come+"\t\t"+comeDetails+"\n";
					break;
				case 3:
					System.out.print("本次支出金额: ");
					int spend = sc.nextInt();
					System.out.print("本次支出说明: ");
					String spendDetails = sc.next();
					balance -= spend;
					details += "支出\t"+balance+"\t\t"+spend+"\t\t"+spendDetails+"\n";
					break;
				case 4:
					System.out.println("确认是否退出(Y/N)：");
					String s = sc.next();
					if(s.equals("Y")){
						flag = false;
					}
					break;
				default:
					System.out.println("输入有误！");
			}
		}
		
	}
}
