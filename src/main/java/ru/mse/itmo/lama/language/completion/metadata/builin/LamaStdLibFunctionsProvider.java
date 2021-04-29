package ru.mse.itmo.lama.language.completion.metadata.builin;

import com.intellij.codeInsight.lookup.LookupElement;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    private final static List<LamaFunction> DataList = List.of(
            function("size", "(l)"),
            function("foldl", "(f, acc, l)"),
            function("foldr", "(f, acc, l)"),
            function("iter", "(f, l)"),
            function("map", "(f, l)"),
            function("reverse", "(l)"),
            function("assoc", "(l, x)"),
            function("find", "(f, l)"),
            function("flatten", "(l)"),
            function("deepFlatten", "(l)"),
            function("zip", "(a, b)"),
            function("unzip", "(a)"),
            function("remove", "(f, l)"),
            function("filter", "(f, l)")
    );

    private final static List<LamaFunction> Array = List.of(
            function("initArray", "(n, f)"),
            function("mapArray", "(f, a)"),
            function("arrayList", "(a)"),
            function("listArray", "(l)"),
            function("foldlArray", "(f, acc, a)"),
            function("foldrArray", "(f, acc, a)"),
            function("iterArray", "(f, a)"),
            function("iteriArray", "(f, a)")
    );

    private final static List<LamaFunction> Ostap = List.of(
            function("logOn", "()"),
            function("initOstap", "()"),
            function("memo", "(f)"),
            function("token", "(x)"),
            function("loc", "(k)"),
            function("eof", "(k)"),
            function("empty", "(k)"),
            function("alt", "(a, b)"),
            function("seq", "(a, b)"),
            function("lift", "(f)"),
            function("bypass", "(f)"),
            function("opt", "(a) {empty @ lift (None) | a @ fun (x) {Some (x)"),
            function("rep0", "(a)"),
            function("rep", "(a)"),
            function("listBy", "(item, sep)"),
            function("list0By", "(item, sep)"),
            function("list", "(item)"),
            function("list0", "(item)"),
            function("observe", "(name, f)"),
            function("showStream", "(name)"),
            function("parse", "(p, m)"),
            function("parseString", "(p, s)"),
            function("left", "(op, f)"),
            function("right", "(op, f)"),
            function("expr", "(ops, opnd)")
    );

    private final static List<LamaFunction> CollectionData = List.of(
            function("validateColl", "([t, compare])"),
            function("internalOf", "(m)"),
            function("compareOf", "(m)"),
            function("emptyMap", "(compare)"),
            function("isEmptyMap", "([l, _])"),
            function("addMap", "(m, k, v)"),
            function("findMap", "(m, k)"),
            function("removeMap", "(m, k)"),
            function("bindings", "(m)"),
            function("listMap", "(l, compare)"),
            function("iterMap", "(f, m)"),
            function("mapMap", "(f, m)"),
            function("foldMap", "(f, acc, m)"),
            function("emptySet", "(compare)"),
            function("isEmptySet", "(s)"),
            function("addSet", "(s, v)"),
            function("memSet", "(s, v)"),
            function("removeSet", "(s, v)"),
            function("elements", "(m)"),
            function("union", "(a, b)"),
            function("diff", "(a, b)"),
            function("listSet", "(l, compare)"),
            function("iterSet", "(f, s)"),
            function("mapSet", "(f, s)"),
            function("foldSet", "(f, acc, s)"),
            function("emptyCustomMemo", "(pred, compare)"),
            function("emptyMemo", "()"),
            function("lookupMemo", "(mm@[p, m], v)"),
            function("emptyHashTab", "(n, hash, compare)"),
            function("addHashTab", "(ht@[a, compare, hash], k, v)"),
            function("findHashTab", "([a, compare, hash], k)"),
            function("removeHashTab", "(ht@[a, compare, hash], k)"),
            function("hashOf", "(ht)")
    );

    private final static List<LamaFunction> Matcher = List.of(
            function("createRegexp", "(r, name)"),
            function("showMatcher", "(m)"),
            function("endOfMatcher", "(m)"),
            function("matchString", "(m, s)"),
            function("matchRegexp", "(m, r)"),
            function("getLine", "(m)"),
            function("getCol", "(m)"),
            function("initMatcher", "(buf)")
    );

    private final static List<LamaFunction> Buffer = List.of(
            function("emptyBuffer", "()"),
            function("singletonBuffer", "(x)"),
            function("listBuffer", "(x)"),
            function("addBuffer", "(buf, x)"),
            function("concatBuffer", "(buf, x)"),
            function("getBuffer", "(buf)")
    );

    private final static List<LamaFunction> Timer = List.of(
            function("timer", "()"),
            function("toSeconds", "(t)")
    );

    private final static List<LamaFunction> Ref = List.of(
            function("ref", "(x)"),
            function("deref", "(x)")
    );

    private final static List<LamaFunction> Lazy = List.of(
            function("makeLazy", "(f)"),
            function("force", "(f)")
    );

    private final static List<LamaFunction> STM = List.of(
            function("returnST", "(x)"),
            function("chainST", "(xs)")
    );

    private final static List<LamaFunction> Fun = List.of(
            function("id", "(x)"),
            function("fix", "(f)")
    );

    private final static List<LamaFunction> Random = List.of(
            function("randomInt", "()"),
            function("randomString", "(len)"),
            function("randomArray", "(f, n)"),
            function("split", "(n, k)"),
            function("structure", "(n, nodeSpec, leaf)")
    );

    public List<LookupElement> getFunctions() {
        return Stream.of(
            BUILTIN,
            DataList,
            Array,
            Ostap,
            CollectionData,
            Matcher,
            Buffer,
            Timer,
            Ref,
            Lazy,
            STM,
            Fun,
            Random
        )
                .flatMap(Collection::stream)
                .map(LamaFunction::getLookupElement)
                .collect(Collectors.toList());
    }

    private static LamaFunction function(String name, String signature) {
        return new LamaFunction(name, signature);
    }
}
