package junits;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnveCheck implements ExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		String ExpEnv = "DEV";
		String ActEnv = "PROEV";
		
	
	if(ExpEnv.equals(ActEnv)) {
		return ConditionEvaluationResult.enabled("The Env value match");
		
	}
	
	return ConditionEvaluationResult.disabled("The Env value is not match");
	}

}
