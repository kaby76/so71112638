# Template generated code from trgen 0.14.1
function Build-Grammar {
    $g = antlr Expression.g4 -Dlanguage=Java 
    if($LASTEXITCODE -ne 0){
        return @{
            Message = $g
            Success = $false
        }
    }

    $msg = javac ExpressionParser.java ExpressionLexer.java  Program.java ErrorListener.java
    return @{
        Message = $msg
        Success = $LASTEXITCODE -eq 0
    }
}

function Test-Case {
    param (
        $InputFile,
        $TokenFile,
        $TreeFile,
        $ErrorFile
    )
    $o = trwdog java Program -file $InputFile
    $failed = $LASTEXITCODE -ne 0
    if ($failed -and $errorFile) {
        return $true
    }
    if(!$failed -and !$errorFile){
        return $true
    }
    return $false
}