Dynamic Connectivity Problem - https://en.wikipedia.org/wiki/Dynamic_connectivity

1. Eager algorithm to solve the DCP is using - QuickFind.
2. Lazy Quick Union- Using trees in the forest to represent the connected nodes.
3. Weighted Quick Union- Using the forest with lowest size to connect to the forest with big size during the union operation.
4. Path Compression Quick Union- setting the root of each node to its grand parent during the root operation to reduce the root search and flattening the tree.
