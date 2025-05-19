## Sorting

### Selection Sort

For the ith iteration, find the smallest element in the array and replace with i and increment i.

### Insertion Sort

For the ith iteration, swap a[i] with each larger entry to its left.

### Shell Sort

Uses h (3*x + 1) to sort the array using insertion. with every run of insertion sort for h, change h = h/3 and perform
insertion sort until h = 1.

### Merge Sort

Merge sort is a divide-and-conquer sorting algorithm. It recursively divides the input array into two halves, sorts them
independently, and then merges the sorted halves. This process continues until the base case of single-element arrays is
reached, which are inherently sorted. The merging step is crucial, where two sorted sub-arrays are combined into one
sorted array.

### Bottom-up merge sort

Pass through the array, merging sub-array of size 1. Repeat the merging process with sub-array of size 2, 4, 8, 16...

### Quick Sort

Quick sort works by partitioning the array into 2 parts where all elements to the left of the partitioning element are
smaller than the partitioning element and all the elements to the right are greater than the partitioning element. The
algorithm then left and right sub-array with partitioning element and recursively sort the array.

### Running time of sorting algorithms

| <o>Algorithm</o>            | <o>In Place</o> | <o>Best Case</o> | <o>Worst Case</o> | <o>Stability</o> |
|:----------------------------|:---------------:|:----------------:|:-----------------:|:----------------:|
| Selection Sort              |        Y        |       N*N        |        N*N        |        N         |
| Insertion Sort              |        Y        |        N         |        N*N        |        Y         |
| Shell Sort                  |        Y        |     N*log(N)     |        N*N        |        N         |
| Merge Sort                  |        N        |     N*log(N)     |     N*log(N)      |        Y         |
| Bottom-up Merge Sort        |        N        |     N*log(N)     |     N*log(N)      |        Y         |
| Quick Sort                  |        Y        |     N*log(N)     |        N*N        |        N         |
| Three way Partitioning Sort |        Y        |        N         |     N*log(N)      |        N         |

## Sorting application

Obvious applications-
* sort music library
* display google page rank result
* List RSS feed in reverse chronological order

Other applications-
* Identify statistical outliers
* Binary search in the database
* Find duplicates in the mailing list

Non-obvious applications- 
* Data Compression
* Computer Graphics
* Computational biology
* Load balancing in parallel computers

<style>
r { color: Red; font-weight: Bold }
o { color: Orange; font-weight: Bold }
g { color: Green; font-weight: Bold }
</style>