#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *create_node(int data)
{
    struct node *n = (struct node *)malloc(sizeof(struct node));
    n->data = data;
    n->left = NULL;
    n->right = NULL;
    return n;
}

int isBST(struct node *root)
{
    static struct node *prev = NULL;
    if (root != NULL)
    {
        if (!isBST(root->left))
        {
            return 0;
        }
        if (prev != NULL && root->data <= prev->data)
        {
            return 0;
        }
        prev = root;
        return isBST(root->right);
    }
    else
    {
        return 1;
    }
}

// struct node* Search(struct node*root, int key){
//     if(root==NULL){
//         return NULL;
//     }
//     if(root->data==key){
//         return root;
//     }
//     else if (root->data>key)
//     {
//         return Search(root->left, key);
//     }
//     else{
//         return Search(root->right, key);
//     }
// }

struct node *iterativeSearch(struct node *root, int key)
{
    while (root != NULL)
    {
        if (root->data == key)
        {
            return root;
        }
        if (root->data > key)
        {
            root = root->left;
        }
        else
        {
            root = root->right;
        }
    }
    return NULL;
}

int main()
{
    struct node *p = create_node(5);
    struct node *p1 = create_node(3);
    struct node *p2 = create_node(6);
    struct node *p3 = create_node(1);
    struct node *p4 = create_node(4);

    p->left = p1;
    p->right = p2;
    p1->left = p3;
    p1->right = p4;

    printf("\n");

    // if(isBST(p)){
    //     printf("This is Binary Serach Tree!");
    // }
    // else{
    //     printf("This is not Binary Search Tree!");
    // }

    // struct node* n = Search(p, 10);
    struct node *n = iterativeSearch(p, 3);

    if (n != NULL)
    {
        printf("Found: %d", n->data);
    }
    else
    {
        printf("Element not found!");
    }
    return 0;
}