package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @ClassName: LogAspects
 * @Description: 切面类
 * @Author ONESTAR
 * @Date: 2021/3/28 19:20
 * @微信：YXK-ONESTAR
 * @URL：https://onestar.newstar.net.cn/
 * @Version 1.0
 */
@Aspect
public class LogAspects {

    // 抽取公共的切入表达式
    @Pointcut("execution(public int service.MathCalculator.*(..))")
    public void pointCut(){};

    // 在目标方法之前切入，参数为切入表达式，指定在哪个方法切入
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("@Before:"+ joinPoint.getSignature().getName() + "运行，参数列表：{"+ Arrays.asList(args)+"}");
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        System.out.println("@After:"+ joinPoint.getSignature().getName()+"运行结束");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){
        System.out.println("@AfterReturning"+ joinPoint.getSignature().getName() +" 正常返回，运行结果：{"+ result +"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception){
        System.out.println("@After:" + joinPoint.getSignature().getName() + "Throwing除法异常，异常信息：{"+exception+"}");
    }
}
