package sorting;

import schemas.Task;

import java.util.Comparator;

public class SortByDataOlder implements Comparator<Task>
{
    @Override
    public int compare(Task fTask, Task sTask)
    {
        return fTask.getCreatedAt().compareTo(sTask.getCreatedAt());
    }
}
