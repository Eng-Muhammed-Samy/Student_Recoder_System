
package student_recoder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;



public class Services {
    //  this function used to load the student While running the program
	public static Students loadStudents(String path) {

		ObjectMapper mapper = new ObjectMapper();// crate mapper object
		Students students = null;

		try {
                    /* load the data during running the program and convert the 
                        json String to java object 
                          by file path and class name
                    */
			students = mapper.readValue(new File(path), Students.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return students;// the return depends of Students class {student {id, name,...}}

	} 
        
        public static void writestudent(Students students, String path) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(path), students);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
