public class Main {
    public static void main(String[] args) {
        int[][] image = [{1, 1, 1},{1, 1, 0},[1, 0, 1]];
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc + 1] != null) {

        }
    }
}

// thoughts:
// each graph node has 4 pointers instead of 2 as with a DLL. we have L, R, U, D.
// if node. L, R, U or D has same color, then change that to new color and make that the new node.
// when no criteria met loop back to first node.
// usinng example on leetcode, pointer to L node(0,1) of primary pixel (1,1) is same color. store its value,
// change its color, it has no L. R is is start node. Up (0,0) has same stored color, only its right changes (1,0).
// then only its R changes (2,0). now we go back to (0,1) since we only explored and filled the range going R, L, and U.
// only down remains. we use the original stored color from first pixel and change (0,2). all fills complete.
//this feels like recursion to me where the original node has 4 if conditions. in eaach condition is a rcursive call to
// the new method instannce on the new node. when an end  is finally reached with terminal node and all its directions
// filled, its popped from the call stack and works though the call stack popping off, just like the entirety of right
// side of a tree is explored through its R node before any of the left side. but now there are 4 primary roots that
// inter-connect.

// Problem with this version is that im not given a template class with fields and constructors stated.
// I've been given a multi-dimensional array and need a new approach using just numbers. Instead of pointers, increment
// or decrement coordinates. if (1,1) is start node with pointers of (sr,sc). For R node, say 'if sc != null, thenn
// recursively run floodFill(image, sr, sc+1, color) so on and so forth

//