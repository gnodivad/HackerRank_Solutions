# Plus Minus

## golang

```go

package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the plusMinus function below.
func plusMinus(arr []int32) {
    var positive, negative, zero int32
    for _, i := range arr {
        if i > 0 {
            positive++
        } else if i == 0 {
            zero++
        } else {
            negative ++
        }
    }

    fmt.Printf("%.6f\n", float32(positive) / float32(len(arr)))
    fmt.Printf("%.6f\n", float32(negative) / float32(len(arr)))
    fmt.Printf("%.6f\n", float32(zero) / float32(len(arr)))
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    nTemp, err := strconv.ParseInt(readLine(reader), 10, 64)
    checkError(err)
    n := int32(nTemp)

    arrTemp := strings.Split(readLine(reader), " ")

    var arr []int32

    for i := 0; i < int(n); i++ {
        arrItemTemp, err := strconv.ParseInt(arrTemp[i], 10, 64)
        checkError(err)
        arrItem := int32(arrItemTemp)
        arr = append(arr, arrItem)
    }

    plusMinus(arr)
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}
```