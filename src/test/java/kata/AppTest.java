package kata;

import com.larseckart.tcr.CommitOnGreenExtension;
import com.larseckart.tcr.TestCommitRevertExtension;
import com.larseckart.tcr.TestCommitRevertMainExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(TestCommitRevertExtension.class)        // revert everything on failure
//@ExtendWith(TestCommitRevertMainExtension.class)    // revert tests on failure
//@ExtendWith(CommitOnGreenExtension.class)    // don't revert, only commit on success
class AppTest {

    @Test
    void my_first_test() {
        assertThat(App.answer()).isEqualTo("42");
    }
}
