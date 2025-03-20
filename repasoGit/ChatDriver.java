public class ChatDriver{
	
	public static void main(String[] args){
		ChatBot chat1 = new ChatBot();
		System.out.println(chat1);
		System.out.printn("---- ChatGPT -----");
		ChatBot chat2 = new ChatBot("ChatGPT", "OpenAI", true, false);
		System.out.println(chat2);		
	}
}
