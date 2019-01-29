class Position {
	private int docId;
	private int indvfreq;
	private String pos; 
	Position (int docId, int indvfreq, String pos) {
		this.docId = docId;
		this.indvfreq = indvfreq;
		this.pos = pos;
	}
	public int getdocId(){
		return docId;
	}

	public void setdocId(int docId){
		this.docId = docId;
	}

	public int getindvfreq(){
		return indvfreq;
	}

	public void setindvfreq(int indvfreq){
		this.indvfreq = indvfreq;
	}

	// public int gettotalfreq(){
	// 	return totalfreq;
	// }

	// public void settotalfreq(int totalfreq){
	// 	this.totalfreq = totalfreq;
	// }
	public String getpos(){
		return pos;
	}

	public void setpos(String pos){
		this.pos = pos;
	}

	public String toString() {
		return this.docId + ", " + this.indvfreq + ", " + this.pos;
	}
}