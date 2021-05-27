package kodlamaio.hrms2.core.results;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult(T data,boolean success,String message){
        super(data,false,message);

    }
    public ErrorDataResult(T data,boolean success){
        super(data,false);

    }

    public ErrorDataResult(String message){
        super(null,false,message);
    }
    public ErrorDataResult(){
        super(null,false);
    }
}
