package softwaredesign.extraction.metrics;

import softwaredesign.extraction.Commit;
import softwaredesign.extraction.types.SingleData;

import java.util.List;

public class NumberOfLinesAdded extends SingleData<Integer> {

    public NumberOfLinesAdded(List<Commit> commits) {
        super(
                "Number of Lines Added",
                "This is the number of lines added across all files that were ever created in the project",
                extract(commits)
        );
    }

    private static Integer extract(List<Commit> commits) {
        int value = 0;
        for (Commit commit : commits) {
            value += commit.fileStats.getInsertions();
        }
        return value;
    }
}
