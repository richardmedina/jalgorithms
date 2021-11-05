package jalgorithms.common.customalgorithms;

public interface CustomAlgorithm<TResult, TParams> {
    TResult run(TParams param);
}
