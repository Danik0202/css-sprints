public class PowerOperation {
    int getPower(int a, int b) {
        Operator op = (x, x1) -> {
            int result = 1;
            for (int i = 1; i <= x1; i++) {
                result = result * x;
            }
            return result;
        };
        return op.toOperate(a, b);
    }
}
