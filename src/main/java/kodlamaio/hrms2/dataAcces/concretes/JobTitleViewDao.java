package kodlamaio.hrms2.dataAcces.concretes;

import kodlamaio.hrms2.entities.concretes.jobTitle;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class JobTitleViewDao implements Serializable {
    private static final long serialVersionUID = 1l;

    private final int id;
    private final String title;

    public JobTitleViewDao(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public static JobTitleViewDao of(jobTitle jobTitle) {return new JobTitleViewDao(jobTitle.getId(), jobTitle.getTitle());
    }
}
