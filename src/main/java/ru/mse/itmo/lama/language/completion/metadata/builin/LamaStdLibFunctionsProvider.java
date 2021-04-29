package ru.mse.itmo.lama.language.completion.metadata.builin;

import com.intellij.codeInsight.lookup.LookupElement;

import java.util.List;
import java.util.stream.Collectors;

public class LamaStdLibFunctionsProvider {
    private final static List<LamaFunction> BUILTIN = List.of(
            function("assert", "(n, s, ...)"),
            function("string", "(x)"),
            function("length", "(x)"),
            function("stringInt", "(s)"),
            function("read", "()"),
            function("write", "(int)"),
            function("makeArray", "(size)"),
            function("makeString", "(size)"),
            function("makeString", "(size)"),
            function("stringcat", "(list)"),
            function("stringcat", "(list)"),
            function("matchSubString", "(subj , patt , pos)"),
            function("sprintf", "(fmt, ...)"),
            function("substring", "(str, pos , len)"),
            function("clone", "(value)"),
            function("hash", "(value)"),
            function("tagHash", "(s)"),
            function("compare", "(value1, value2)"),
            function("flatCompare", "(x , y)"),
            function("fst", "(value)"),
            function("snd", "(value)"),
            function("hd", "(value)"),
            function("tl", "(value)"),
            function("readLine", "()"),
            function("printf", "(fmt, ...)"),
            function("fopen", "(fname , mode)"),
            function("fclose", "(file)"),
            function("fread", "(fname)"),
            function("fwrite", "(fname , contents)"),
            function("fprintf", "(file , fmt , ...)"),
            function("regexp", "(str)"),
            function("regexpMatch", "(pattern, subj , pos)"),
            function("failure", "(fmt, ...)"),
            function("system", "(cmd)"),
            function("getEnv", "(name)"),
            function("random", "(n)"),
            function("time", "()")
    );

    public List<LookupElement> getFunctions() {
        return BUILTIN.stream()
                .map(LamaFunction::getLookupElement)
                .collect(Collectors.toList());
    }

    private static LamaFunction function(String name, String signature) {
        return new LamaFunction(name, signature);
    }
}
