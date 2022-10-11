#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;
};

void DoublyLinkedList(struct Node *ptr, struct Node *p){
    while (ptr != NULL)
    {

        printf("Element : %d\n", ptr->data);
        ptr = ptr->next;
    }

    printf("\n");
    
    while (p != NULL)
    {

        printf("Element : %d\n", p->data);
        p = p->prev;
    }
}

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
    head->prev = NULL;
    head->next = first;

    first->data = 21;
    first->prev = head;
    first->next = second;

    second->data = 62;
    second->prev = first;
    second->next = third;

    third->data = 35;
    third->prev = second;
    third->next = NULL;

    DoublyLinkedList(head, third);
    return 0;
}
