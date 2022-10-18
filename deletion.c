#include <stdio.h>

void display(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int deletion(int arr[], int len, int index)
{

    if (index >= len)
    {
        return -1;
    }

    else
    {
        for (int i = index; i <= len - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        return 1;
    }
}

int main()
{
    int arr[100] = {5, 6, 7, 8, 10};
    int len = 5;
    display(arr, len);
    deletion(arr, len, 0);
    len = len - 1;
    display(arr, len);
    return 0;
}
