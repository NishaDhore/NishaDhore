import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo 
{
public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Leave ob=new Leave();
		
		
		Class cls = ob.getClass();
        System.out.println("The name of class is : " + cls.getName());
		
		//1
        System.out.println("\n--------------1. name of the constructor-------------");
		Constructor constructor = cls.getConstructor();
        System.out.println(constructor.getName());
        //2
        System.out.println("\n-----------2. modifiers with constructors-------------");
        Constructor constructor1[] = cls.getDeclaredConstructors();    
        System.out.println(Arrays.toString(constructor1));
    
        //3
        System.out.println("\n------------3. fields-------------");
        List<Field> getAllField = new ArrayList<Field>();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			getAllField.add(field);
		}
		for (Field t : getAllField) {
			// get name
			System.out.println(t.getName());
		}
        
        //4
        System.out.println("\n-------------4. modifier for fields-------------");
        for (Field t : getAllField)
			// get name
			System.out.println(Modifier.toString(t.getModifiers()) + " " + t.getName());

        //5
        System.out.println("\n--------------5. methods-------------");
        Method[] methods = cls.getMethods();
		for (Method method : methods)
			System.out.println(method.getName());

		//6
		System.out.println("\n--------6. return type of all methods----------");
		for (Method method : methods)
			System.out.println(method.getReturnType());
		
		//7
		System.out.println("\n-----------7. modifier of methods------------");
		for (Method method : methods)
			System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType() + " " + method.getName());

		//8
		System.out.println("\n--------8. Change the access modifier of a method(private method) and then invoke the method using reflection API.");
		Object ob1 = cls.newInstance();
		Method m = cls.getDeclaredMethod("m2", null);
		m.setAccessible(true);
		m.invoke(ob1, null);
		
		
      
}
}
