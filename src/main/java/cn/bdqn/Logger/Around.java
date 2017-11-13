package cn.bdqn.Logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class Around {
	private static Logger log = Logger.getLogger(Around.class);
	/**
	 * 环绕增强
	 */
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		Object result =null;
		try {
			log.info("前置增强:"+pjp.getTarget() + "的" +pjp.getSignature().getName() +
					"的方法，参数是"+Arrays.toString(pjp.getArgs()));
			
			log.info("后置增强:"+pjp.getTarget() + "的" +pjp.getSignature().getName() +
					"的方法，返回值是"+ result);
			return result;
		} catch (Throwable e) {
			log.error(pjp.getSignature().getName() + "方法发生异常："+ e);
			throw e;
		}finally {
			log.info("这是最终增强处理");
		}
		
		
	}
}
