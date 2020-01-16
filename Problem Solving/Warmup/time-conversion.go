package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strings"
    "strconv"
)

/*
 * Complete the timeConversion function below.
 */
func timeConversion(s string) string {
    /*
     * Write your code here.
     */
    isPm := s[len(s) - 2:] == "PM"
    time := strings.Split(s[:len(s) - 2], ":")

    hour, _ := strconv.Atoi(time[0])
    if (isPm && hour < 12) {
        hour += 12
    } else if (!isPm && hour == 12) {
        hour -= 12
    }

    time[0] = fmt.Sprintf("%02d", hour)

    return strings.Join(time, ":");
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    outputFile, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer outputFile.Close()

    writer := bufio.NewWriterSize(outputFile, 1024 * 1024)

    s := readLine(reader)

    result := timeConversion(s)

    fmt.Fprintf(writer, "%s\n", result)

    writer.Flush()
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
