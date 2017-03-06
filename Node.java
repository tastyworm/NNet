
public class Node {

	private int x;					// The x-axis of the top-left corner of the node (graphic)
	private int y;					// The y-axis of the top-left corner of the node (graphic)
	private int height;				// The height of the node (graphic)
	private int width;				// The width of the node (graphic)
	private int inc_connx;			// The x-axis of the incoming connector-lines (graphic)
	private int inc_conny;			// The y-axis of the incoming connector-lines (graphic)
	private int out_connx;			// The x-axis of the outgoing connector-lines (graphic)
	private int out_conny;			// The y-axis of the outgoing connector-lines (graphic)
	private String nodeType;		// The type of node (I)nput, (O)utput, (H)idden
	private double value;			// The value of the node
	private static int totalNodes;	// The total number of nodes within the network

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
		totalNodes++;
	}

	public int getTotalNodes() {
		return totalNodes;
	}

	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
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
