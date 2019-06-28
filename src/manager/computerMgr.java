package manager;

import java.util.Scanner;

import computer.Computer;
import computer.Notebook;
import computer.Desktop;

public class computerMgr {
    private Computer[] computers = new Computer[7];
    private int cnt = 0;

    public computerMgr() {

    }

    public computerMgr(Computer[] computers) {
        this.computers = computers;
    }

    public void initial() {
        computers[0] = new Notebook("T61", "IBM", "Intel酷睿2", "2GB", "160GB", "14.1英寸", "6芯");
        computers[1] = new Notebook("X60", "IBM", "Intel酷睿2", "512MB", "60GB", "12.1英寸", "6芯");
        computers[2] = new Desktop("530MT", "戴尔", "Intel酷睿2", "512MB", "80GB", "19英寸", "卧式");
        computers[3] = new Desktop("Lenovo5050", "联想", "AMD速龙64", "1GB", "160GB", "22英寸", "立式");
        computers[4] = new Notebook("u4000", "华硕", "酷睿i5", "4GB", "160GB", "14英寸", "9芯");
        computers[5] = new Desktop("Lenovo天逸", "联想", "酷睿i5", "8GB", "1TB", "22英寸", "立式");
        cnt = 6;
    }

    /**
     * 开始菜单
     */
    public boolean startMenu() {
        System.out.println("\t\t欢迎电脑管理系统");
        System.out.println("-------------------------------------");
        System.out.println("请选择用户操作：1：查看电脑信息\t2:增加电脑信息\t3:删除电脑信息\t4:退出");
        System.out.print("请选择： ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
        case 1:// show
            show();
            showSingleComputer();
            break;
        case 2:// add
            add();
            show();
            break;
        case 3:// delete
            delete();
            break;
        case 4:// quit
            System.out.println("\n谢谢使用！");
            return true;
        default:
            System.out.println("输入有误，请重新输入");
        }
        return false;

    }

    public void add() {
        if (cnt >= computers.length) {
            Computer[] new_arr = new Computer[computers.length << 1];
            for (int i = 0; i < cnt; ++i) new_arr[i] = computers[i];
            computers = new_arr;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择电脑类型：1：笔记本 \t2：台式机");
        int type;
        while (true) {
            type = sc.nextInt();
            if (type == 1 || type == 2) break;
            else System.out.println("请重新输入！");
        }
        System.out.print("请输入型号名称：");
        String name = sc.next();
        System.out.print("请输入品牌名称：");
        String brand = sc.next();
        System.out.print("请输入CPU：");
        String CPU = sc.next();
        System.out.print("请输入内存：");
        String memory = sc.next();
        System.out.print("请输入硬盘：");
        String disk = sc.next();
        System.out.print("请输入显示器尺寸：");
        String monitor = sc.next();
        if (type == 1) {
            System.out.print("电池芯片：");
            String battery = sc.next();
            computers[cnt++] = new Notebook(name, brand, CPU, memory, disk, monitor, battery);
        } else if (type == 2) {
            System.out.println("请选择机箱类型：1：立式\t2：卧式");
            int hosttype;
            do {
                hosttype = sc.nextInt();
            } while (hosttype != 1 && hosttype != 2);
            String type1;
            switch (hosttype) {
            case 1:
                type1 = "立式";
                break;
            case 2:
                type1 = "卧式";
                break;
            default:
                type1 = null;
                System.err.println("SYSTEM ERROR");
            }
            computers[cnt++] = new Desktop(name, brand, CPU, memory, disk, monitor, type1);
        } else {
            System.err.println("SYSTEM ERROR");
        }
        System.out.println("添加成功，当前电脑信息如下:");
    }

    /**
     * 返回主菜单
     */
    public void returnMain() {
        Scanner input = new Scanner(System.in);
        System.out.print("输入0返回：");
        while (input.nextInt() != 0) {
            System.out.println("无效输入！");
        }
    }
    
    private boolean delete(int n) {
        --n;
        if (n >= cnt) {
            System.out.println("不存在，请重新输入！");
            return false;
        }
        for (int i = n; i < cnt - 1; ++i) computers[i] = computers[i + 1];
        --cnt;
        System.out.println("删除成功！");
        return true;
    }
    
    public void delete() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("请输入删除序号:");
            n = sc.nextInt();
        } while (!delete(n));
    }

    public void show() {
        System.out.println("序号\t\t型号名称\t\t品牌\t\tCPU\t\t内存\t\t硬盘\t\t显示器\t\t电池芯片\t\t机箱类型");
        for (int i = 0; i < cnt; i++) {
            System.out.print(i + 1 + "\t\t");
            computers[i].printInfo(true);
        }
    }
    
    public void showSingleComputer() {
        System.out.println("请输入所选序号：");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id >= 1 && id <= cnt) {
            System.out.println("您选择的电脑具体信息如下");
            if (computers[id - 1] instanceof Notebook) {
                System.out.println("型号名称\t\t品牌\t\tCPU\t\t内存\t\t硬盘\t\t显示器\t\t电池芯片");
                computers[id - 1].printInfo(false);
            } else if (computers[id - 1] instanceof Desktop) {
                System.out.println("型号名称\t\t品牌\t\tCPU\t\t内存\t\t硬盘\t\t显示器\t\t机箱类型");
                computers[id - 1].printInfo(false);
            } else {
                System.err.println("SYSTEM ERROR");
            }
        } else {
            System.out.println("序号有误！");
        }
    }
}
