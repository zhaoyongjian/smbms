package cn.bdqn.Logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class Around {
	private static Logger log = Logger.getLogger(Around.class);
	/**
	 * ������ǿ
	 */
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		Object result =null;
		try {
			log.info("ǰ����ǿ:"+pjp.getTarget() + "��" +pjp.getSignature().getName() +
					"�ķ�����������"+Arrays.toString(pjp.getArgs()));
			
			log.info("������ǿ:"+pjp.getTarget() + "��" +pjp.getSignature().getName() +
					"�ķ���������ֵ��"+ result);
			return result;
		} catch (Throwable e) {
			log.error(pjp.getSignature().getName() + "���������쳣��"+ e);
			throw e;
		}finally {
			log.info("����������ǿ����");
		}
		
		
	}
}
