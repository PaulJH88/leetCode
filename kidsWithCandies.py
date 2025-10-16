def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result = []
        x = max(candies)
        for c in candies:
                if ((c + extraCandies) >= x):
                        result.append(True)
                else:
                        result.append(False)

        return result