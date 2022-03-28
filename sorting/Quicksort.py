import time
start = time.time()

def quicksort(arr):
    if len(arr) < 2:
        return arr
    
    low, mid, high = [], [], []
    
    pivot = arr[len(arr) // 2]
    
    for ele in arr:
        if ele == pivot:
            mid.append(ele)
        elif ele < pivot:
            low.append(ele)
        else:
            high.append(ele)
            
            
    
    return quicksort(low) + mid + quicksort(high)

print(quicksort([int(x) for x in input().split()]))
elapsed = time.time() - start
elapsed = round(elapsed, 2)
print(f"time elapsed in {elapsed} ms")

