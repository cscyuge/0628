package manager;

import java.util.Scanner;

import computer.Computer;

public class computerMgr {
    Computer[] computers = new Computer[50];

    public computerMgr() {

    }

    public computerMgr(Computer[] computers) {
        this.computers = computers;
    }

    public void initial() {

    }

    /**
     * 开始菜单
     */
    public void startMenu(){
             System.out.println("\t\t欢迎电脑管理系统");
             System.out.println("-------------------------------------");
             System.out.println("请选择用户操作：1：查看电脑信息\t2:增加电脑信息\t3:删除电脑信息\t4:退出");     
             System.out.print("请选择： ");
             
             Scanner input = new Scanner(System.in);
             int choice = input.nextInt();
             
             switch(choice){
                case 1://check
                    list();
                    returnMain();
                    break;
                case 2://add
                    System.out.println("\n谢谢 使 用！");
                    break;
                case 3://delete
                    break;
                case 4://quit
                    
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
             }
         
    }

    /**
     * 返回主菜单
     */
    public void returnMain() {
        Scanner input = new Scanner(System.in);
        System.out.print("输入0返回：");
        if (input.nextInt() == 0) {
            startMenu();
        } else {
            System.out.println("输入错误, 异常终止！");
        }
    }

    /**
     * 借出排行榜
     */
    public String[] list() {
        // 定义新数组，用来存放排序后图书信息
        String[] newname = new String[50];
        int[] newcount = new int[50];

        for (int k = 0; k < book.name.length; k++) {
            newname[k] = book.name[k];
            newcount[k] = book.count[k];
        }

        // 利用冒泡排序算法进行排序
        for (int i = 0; i < newname.length; i++) {
            for (int j = i + 1; j < newname.length; j++) {
                if (newcount[i] > newcount[j]) {
                    // TODO 通过数组操作完成顺序交替
                    int t = newcount[i];
                    newcount[i] = newcount[j];
                    newcount[j] = t;
                    String st = newname[i];
                    newname[i] = newname[j];
                    newname[j] = st;

                }
            }
        }
        System.out.println("---> 排行榜\n");
        System.out.println("**************************");
        System.out.println("次数\t名称");
        // 显示排行榜信息
        for (int i = newname.length - 1; i >= 0; i--) {
            if (newname[i] != null) {
                System.out.println(newcount[i] + "\t<<" + newname[i] + ">>");
            }
        }
        System.out.println("**************************");
        // returnMain();
        return newname;
    }
}
