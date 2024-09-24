public class MultiplyOperation {
    int getMultiplication(int a, int b){
        Operator op = (x, x1) -> x*x1;
        return op.toOperate(a, b);
    }
}
