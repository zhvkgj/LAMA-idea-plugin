package ru.mse.itmo.lama.language.psi.ref;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.util.PsiUtils;

import java.util.ArrayList;

public class LamaChooseByNameContributor implements ChooseByNameContributor {

    @Override
    public String @NotNull [] getNames(Project project, boolean includeNonProjectItems) {
        if (project == null) {
            return new String[0];
        }

        var foundElements = PsiUtils.Companion.findAll(project);
        var names = new ArrayList<String>(foundElements.size());
        for (LamaElem foundElement : foundElements) {
            var name = foundElement.getName();
            if (name != null && name.length() > 0) {
                names.add(name);
            }
        }

        return names.toArray(new String[names.size()]);
    }


    @Override
    public NavigationItem @NotNull [] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        var properties = PsiUtils.Companion.findByKey(project, name);
        return properties.toArray(new NavigationItem[properties.size()]);
    }
}
