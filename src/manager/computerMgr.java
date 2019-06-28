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
    public void startMenu() {
        System.out.println("\t\t欢迎电脑管理系统");
        System.out.println("-------------------------------------");
        System.out.println("请选择用户操作：1：查看电脑信息\t2:增加电脑信息\t3:删除电脑信息\t4:退出");
        System.out.print("请选择： ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
        case 1:// show
            show();
            returnMain();
            break;
        case 2:// add
            System.out.println("\n谢谢 使 用！");
            break;
        case 3:// delete
            break;
        case 4:// quit

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
    public void show() {

    }
}
