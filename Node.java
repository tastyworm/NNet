
public class Node {

	private int x;
	private int y;
	private int height;
	private int width;
	private int inc_connx;
	private int inc_conny;
	private int out_connx;
	private int out_conny;
	private String nodeType;

	public Node(int x, int y, int height, int width, String nodeType) throws NodeTypeException {
		super();

		boolean wasFound=false;
		String[] validNodeTypes = new String[] {"I", "O", "H"};
		for (int i=0; i<validNodeTypes.length; i++){           
			if (nodeType==validNodeTypes[i]){
				wasFound=true;
			}
	    }
		
		if (!wasFound) throw new NodeTypeException("Invalid Node Type: " + nodeType);
		
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.inc_connx = x - 1;
		this.inc_conny = y + ((int) (0.5 * height));
		this.out_connx = x + width - 1;
		this.out_conny = this.inc_conny;
		this.nodeType = nodeType;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getInc_connx() {
		return inc_connx;
	}

	public int getInc_conny() {
		return inc_conny;
	}

	public int getOut_connx() {
		return out_connx;
	}

	public int getOut_conny() {
		return out_conny;
	}

	public String getNodeType() {
		return nodeType;
	}

}
