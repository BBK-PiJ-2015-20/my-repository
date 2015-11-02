public class ArrayCopier {
	public void copy(int[] src, int[] dst) {
		int count = 0;
		if(src.length < dst.length) {
			while(count <= src.length) {
				dst[count] = src[count];
				count++;
			}
			while(count <= dst.length) {
				dst[count] = 0;
				count++;
			}
		} else {
			while(count <= dst.length) {
				dst[count] = src[count];
				count++;
			}
			while(count <= src.length) {
				src[count] = 0;
				count++;
			}
		}
	}
}