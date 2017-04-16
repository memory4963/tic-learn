import java.util.Scanner;

public class Graph {
    public static void main(String ... args) {
        // 读取输入
        System.out.print("请输入棱形的行数(>=3且为奇数)：");
        Scanner scanner = new Scanner(System.in);
        int lineNum;
        if (scanner.hasNextInt()) {
            lineNum = scanner.nextInt();
            if (lineNum < 3 || lineNum % 2 == 0) {
                System.out.print("请输入正确的行数.");
                return;
            }
            lineNum = lineNum / 2 + 1;
        }
        else{
            System.out.print("请输入正确的行数.");
            return;
        }

        // 输出正三角形
        for (int index = 1; index <= lineNum; index++ ) {
            drawOneLine(index, lineNum);
        }

        // 输出倒三角形
        for (int index = lineNum - 1; index >= 1; index-- ) {
            drawOneLine(index, lineNum);
        }
    }

    private static void drawOneLine(int currentIndex, int lineNum) {
        // 输出空格
        for (int spaceCurrentIndex = 0; spaceCurrentIndex < lineNum - currentIndex; spaceCurrentIndex ++ ) {
            System.out.print(" ");
        }

        // 输出字符'X'和'O'
        for (int charCurrentIndex = 1; charCurrentIndex <= (currentIndex * 2 - 1); charCurrentIndex++) {
            if (charCurrentIndex % 2 == 0) {
                System.out.print("X");
            }
            else {
                System.out.print("O");
            }
        }

        // 换行
        System.out.print("\n");
    }
}
