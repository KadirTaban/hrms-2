package kodlamaio.hrms2.core.business;


import kodlamaio.hrms2.core.results.Result;
import kodlamaio.hrms2.core.results.SuccessResult;

public class BusinessRules {

    public static Result run(Result... logics){
        for (Result logic:logics){
            if (!logic.isSuccess()){
                return logic;
            }
        }
        return new SuccessResult();
    }
}
