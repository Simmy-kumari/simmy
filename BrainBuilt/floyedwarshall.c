//floyd warshall
#include<stdio.h>
#define v 4
#define INF 9999

int main(){
    int i,j,k;
    int dist[v][v]  = {
        {0,3,INF,7},
        {8,0,2,INF},
        {5,INF,0,1},
        {2,INF,INF,0}
    };
    for (int k = 0; k < v; k++) { // path via vertex
        for (int i = 0; i < v; i++) { // Source vertex
            for (int j = 0; j < v; j++) { // Destination vertex
                // Check condition of distance from given graph
                if (dist[i][k] + dist[k][j] < dist[i][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j]; // Update distance
                }
            }
        }
    }

    // Print the final shortest distances matrix
    printf("The shortest distances between every pair of vertices:\n");
    for (int i = 0; i < v; i++) {
        for (int j = 0; j < v; j++) {
            if (dist[i][j] == INF)
                printf("%s\t", "INF"); // Print "INF" if no path
            else
                printf("%d\t", dist[i][j]); // Print the distance
        }
        printf("\n"); // New line for each row
    }
    return 0;
}