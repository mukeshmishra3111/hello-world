import java.io.File;
class CreateFile 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		final String fileName ="Hello.txt";

		File file = null;
		
		try{
			file =new File(fileName);

			if (file.exist())
			{
				System.out.println("File Exists");
			}
			else{
				if(file.createNewFile()){
					System.out.println("File Created Successfully...");
				}else{
					System.out.println("File Creation Failed...");
				}
			}
		}catch(Exception ex){

			Sytem.out.println(ex.printStackTrace());
		}


		

	}
}
