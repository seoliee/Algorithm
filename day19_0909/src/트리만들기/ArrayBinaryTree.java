package 트리만들기;

import java.util.Arrays;

public class ArrayBinaryTree {
	
    private String[] tree;
    private int lastIndex; // 트리에 마지막으로 추가된 노드의 인덱스

    public ArrayBinaryTree(int size) {
        // 배열을 'null'로 초기화하여 빈 노드를 나타냅니다.
        tree = new String[size];
        lastIndex = -1; // 초기에는 노드가 없으므로 -1로 설정
    }

    // 배열에 노드를 추가합니다.
    public void addNode(String data) {
        if (lastIndex + 1 < tree.length) {
            lastIndex++;
            tree[lastIndex] = data;
            System.out.println("노드 '" + data + "'가 인덱스 " + lastIndex + "에 추가되었습니다.");
        } else {
            System.out.println("트리가 꽉 찼습니다. 노드를 추가할 수 없습니다.");
        }
    }

    // 특정 인덱스의 부모 노드 인덱스를 반환합니다.
    // 루트 노드(인덱스 0)는 부모가 없습니다.
    public int getParentIndex(int index) {
        if (index > 0 && index <= lastIndex) {
            return (index - 1) / 2;
        }
        return -1; // 유효하지 않은 인덱스
    }

    // 특정 인덱스의 왼쪽 자식 노드 인덱스를 반환합니다.
    public int getLeftChildIndex(int index) {
        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex <= lastIndex) {
            return leftChildIndex;
        }
        return -1; // 왼쪽 자식이 없거나 유효하지 않은 인덱스
    }

    // 특정 인덱스의 오른쪽 자식 노드 인덱스를 반환합니다.
    public int getRightChildIndex(int index) {
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex <= lastIndex) {
            return rightChildIndex;
        }
        return -1; // 오른쪽 자식이 없거나 유효하지 않은 인덱스
    }

    // 트리 배열의 현재 상태를 출력합니다.
    public void printTree() {
        System.out.println("트리 배열: " + Arrays.toString(tree));
    }

    public static void main(String[] args) {
        ArrayBinaryTree tree = new ArrayBinaryTree(10);

        tree.addNode("A"); // 인덱스 0
        tree.addNode("B"); // 인덱스 1
        tree.addNode("C"); // 인덱스 2
        tree.addNode("D"); // 인덱스 3
        tree.addNode("E"); // 인덱스 4
        tree.addNode("F"); // 인덱스 5

        System.out.println("\n--------------------");
        System.out.println("인덱스 1 (B)의 부모: " + tree.getParentIndex(1));
        System.out.println("인덱스 2 (C)의 부모: " + tree.getParentIndex(2));
        System.out.println("인덱스 1 (B)의 왼쪽 자식: " + tree.getLeftChildIndex(1));
        System.out.println("인덱스 1 (B)의 오른쪽 자식: " + tree.getRightChildIndex(1));
        System.out.println("--------------------");

        tree.printTree();
    }
}
