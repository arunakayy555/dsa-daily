import java.util.*;

class Node {
    int coeff, power;
    Node next;

    Node(int c, int p) {
        coeff = c;
        power = p;
        next = null;
    }
}

public class LL {

    // Function to add two polynomials
    public static Node addPolynomial(Node p1, Node p2) {
        Node dummy = new Node(0, 0);
        Node tail = dummy;

        while (p1 != null && p2 != null) {

            if (p1.power == p2.power) {
                int sum = p1.coeff + p2.coeff;

                if (sum != 0) {
                    p1.coeff = sum;
                    tail.next = p1;
                    tail = p1;
                }

                p1 = p1.next;
                p2 = p2.next;
            }

            else if (p1.power > p2.power) {
                tail.next = p1;
                tail = p1;
                p1 = p1.next;
            }

            else {
                tail.next = p2;
                tail = p2;
                p2 = p2.next;
            }
        }

        // attach remaining
        if (p1 != null) tail.next = p1;
        else tail.next = p2;

        return dummy.next;
    }

    // Function to print polynomial
    public static void printPolynomial(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.coeff + "x^" + temp.power);
            if (temp.next != null) System.out.print(" + ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 🔥 MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First polynomial
        int N = sc.nextInt();
        Node head1 = null, tail1 = null;

        for (int i = 0; i < N; i++) {
            int coeff = sc.nextInt();
            int power = sc.nextInt();
            Node newNode = new Node(coeff, power);

            if (head1 == null) {
                head1 = tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // Second polynomial
        int M = sc.nextInt();
        Node head2 = null, tail2 = null;

        for (int i = 0; i < M; i++) {
            int coeff = sc.nextInt();
            int power = sc.nextInt();
            Node newNode = new Node(coeff, power);

            if (head2 == null) {
                head2 = tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        // Add polynomials
        Node result = addPolynomial(head1, head2);

        // Print result
        printPolynomial(result);

        sc.close();
    }
}

/*
int inversionCount(int[] A, int n) {
    if (A == null) return -1;
    if (n < 2) return 0;

    int count = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (A[i] > A[j]) {
                count++;
            }
        }
    }

    return count;
} */