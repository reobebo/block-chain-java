import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgram {

	public static void main(String[] args) {
		//demonstrate a series of blocks in a chain
		ArrayList<Block> blockChain = new ArrayList<Block>();
		
		String[] initialValues = {"Shad has $700","Miguel has $550"};
		Block firstBlock = new Block(initialValues,0);
		blockChain.add(firstBlock);
		System.out.println("First block is "+firstBlock.toString());
		System.out.println("The block chain is "+blockChain.toString());
		
		//block 2
		String[] rakipGivesItAway = {"Rakip gives Tim $400","Rakip gives Tany $60","Rakip gives Terry $100"};
		Block secondBlock = new Block(rakipGivesItAway,firstBlock.getBlockHash());
		blockChain.add(secondBlock);
		System.out.println("Second block is "+secondBlock.toString());
		System.out.println("The block chain is "+blockChain.toString());
		
		
		//block 3
		String[] rakipGetsSomeBack = {"Tim gives Rakip $10", "Terry gives $50 to Rakip"};
		Block thirdBlock = new Block(rakipGetsSomeBack,secondBlock.getBlockHash());
		blockChain.add(thirdBlock);
		System.out.println("Third block is "+thirdBlock.toString());
		System.out.println("The block chain is "+blockChain.toString());
	}

}
