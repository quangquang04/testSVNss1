package testSVNss1;

import java.util.Scanner;

public class MySingleLinkedList {
	Scanner sc = new Scanner(System.in);
    Node head = null;

    void nhapDS() {

        while (true) {
            System.out.print("Nhap phan tu vao ds: ");
            int a = Integer.parseInt(sc.nextLine());
            if (a == 0) {
                break;
            }
            Node t = new Node(a);
            if (head == null) {
                head = t;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = t;
            }
        }
    }

    void inDS() {
        Node p = head;
        while (p != null) {
            System.out.println(p.toString());
            p = p.next;
        }
        System.out.println("null");

    }

    void tongc() {
        int tong = 0;
        Node p = head;
        while (p != null) {
            if (p.data % 2 == 0) {
                tong += p.data;
            }
            p = p.next;
        }
        System.out.println("Tong cac gia tri chan:" + tong);
    }

    void maxDS() {
        if (head == null) {
            System.out.println("DS rong");
        } else {
            Node p = head;
            int Max = 0;
            while (p != null) {
                if (Max < p.data) {
                    Max = p.data;
                }
                p = p.next;
            }
            System.out.println("Max: " + Max);
        }

    }

    void timX(int x) {
        int count = 0;
        boolean chuaX = false;
        Node p = head;
        while (p != null) {
            count++;
            if (x == p.data) {
                chuaX = true;
                break;
            }
            p = p.next;

        }
        if (chuaX == true) {
            System.out.println("DS co chua gia tri: " + x + " tai vi tri: " + count);
        } else {
            System.out.println("DS khong chua gia tri: " + x);
        }
    }

    void hv12() {
        if (head == null||head.next==null) {
            System.out.println("DS khong du 2 phan tu de hoan vi:");
        } else {
            int tam=head.data;
            head.data=head.next.data;
            head.next.data=tam;
        }
    }

    void inkc() {
        if (head == null||head.next==null) {
            System.out.println("DS khong du 2 phan tu de tim gia tri ke cuoi");
        } else {
            Node p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            System.out.println(p.toString());
        }
    }

    void tang() {
        if (head == null) {
            System.out.println("DS rong");
        } else {
            Node p = head;
            boolean tang = true;

            while (p.next != null) {
                if (p.data > p.next.data) {
                    tang = false;
                }
                p = p.next;
            }
            if (tang == true) {
                System.out.println("DS tang dan");
            } else {
                System.out.println("DS khong tang dan");
            }
        }
    }

    void sapxep() {
        if (head == null) {
            System.out.println("DS rong");
        } else {
            Node p = head;
            Node t = null;
            while (p != null) {
                t = p;
                while (t != null) {
                    if (t.data < p.data) {
                        int tam=t.data;
                        t.data=p.data;
                        p.data=tam;
                    }
                    t = t.next;
                }
                p = p.next;
            }
        }
    }

    void chenT(int x) {

        if (head.next == null) {
            System.out.println("DS khong du 2 phan tu");
        } else {
            Node p = head;
            while (p.next != null) {
                if (x >= p.data && x <= p.next.data) {
                    p.next = new Node(x, p.next);
                    break;
                }
                p = p.next;
            }
        }
    }
    public static void main(String[] args) {
    	System.out.println("test git.");

        MySingleLinkedList list = new MySingleLinkedList();
        Scanner sc = new Scanner(System.in);
        list.nhapDS();
        System.out.println("\nIn DS");
        list.inDS();
        
        list.tang();
        
        list.tongc();
        list.maxDS();
        System.out.print("nhap gia tri x muon tim: ");
        int x = Integer.parseInt(sc.nextLine());
        list.timX(x);

        System.out.println("DS da sap xep:");
        list.sapxep();
        list.inDS();
        System.out.println("\nXong.\n");

        System.out.print("nhap gia tri x muon chen: ");
        x = Integer.parseInt(sc.nextLine());
        System.out.println("DS sau khi chen: " + x );
        list.chenT(x);
        list.inDS();
        System.out.println("\nXong.\n");

        System.out.println("DS sau khi hoan vi 1 va 2");
        list.hv12();
        list.inDS();
        System.out.println("\nXong.\n");

        System.out.println("In ke cuoi");
        list.inkc();
        System.out.println("\nXong.");
    }
}
