#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

void CircularLinkedList(struct Node *head)
{
    struct Node *ptr = head;
    printf("Element: %d\n", ptr->data);
    do
    {
        ptr = ptr->next;
        printf("Element: %d\n", ptr->data);
    } while (ptr->next != head);
}

struct Node * insertatFirst(struct Node* head, int data){
    struct Node *p = head->next;
    struct Node *ptr = (struct Node *)malloc(sizeof(struct Node));
    while(p->next!=head){
        p = p->next;
    }
    p->next = ptr;
    ptr->next = head;
    head = ptr;
    ptr->data = data;
    return head;
    
};

int main()
{
    struct Node *head;
    struct Node *first;
    struct Node *second;
    struct Node *third;

    head = (struct Node *)malloc(sizeof(struct Node));
    first = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));

    head->data = 45;
    head->next = first;

    first->data = 21;
    first->next = second;

    second->data = 62;
    second->next = third;

    third->data = 35;
    third->next = head;

    CircularLinkedList(head);
    head = insertatFirst(head, 56);
    head = insertatFirst(head, 99);
    printf("\n");
    CircularLinkedList(head);

    return 0;
}