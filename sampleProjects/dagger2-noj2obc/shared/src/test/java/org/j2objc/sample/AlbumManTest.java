package org.j2objc.sample;

import com.github.j2objccontrib.AlbumMan;
import com.github.j2objccontrib.SharedDaggerComponent;
import com.github.j2objccontrib.network.UrlProvider;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class AlbumManTest {

    SharedDaggerComponent mSharedComponent;
    AlbumMan mAlbumMan;

    @Before
    public void initialize() {

//        final SimpleRest mock = mock(SimpleRest.class);
//
//        when(mock.get(any(String.class))).thenReturn(fakeJson);
//
//        mSharedComponent = DaggerSharedDaggerComponent
//                .builder()
//                .sharedDaggerModule(new SharedDaggerModule(mock, new FakeUrlProvider()))
//                .build();
//
//        mAlbumMan = mSharedComponent.getAlbumMan();
    }


    @Test
    public void testGetAlbums() throws ExecutionException, InterruptedException {
//        final Albums retAlbums = mAlbumMan.fetchAlbums().get();
//
//        Assert.assertNotNull(retAlbums);
//        Assert.assertNotNull(retAlbums.albums);
    }

    @Test
    public void testGetSingleAlbum() {

    }

    @Test
    public void testDeleteAlbum() {

    }

    @Test
    public void testUpdateAlbum() {

    }

    public class FakeUrlProvider implements UrlProvider {

        @Override
        public String getAllAlbumsUrl() { return ""; }

        @Override
        public String getSingleAlbumUrl(int albumId) { return ""; }

        @Override
        public String getPostUrl() { return ""; }

        @Override
        public String getPutUrl(int albumId) { return ""; }

        @Override
        public String getDeleteUrl(int postId) { return ""; }
    }

    public static final String fakeJson = "[\\r\\n  {\\r\\n    \\\"userId\\\": " +
            "1,\\r\\n    \\\"id\\\": 1,\\r\\n    \\\"title\\\": \\\"quidem mole" +
            "stiae enim\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\" +
            "n    \\\"id\\\": 2,\\r\\n    \\\"title\\\": \\\"sunt qui excepturi" +
            " placeat culpa\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\" +
            "r\\n    \\\"id\\\": 3,\\r\\n    \\\"title\\\": \\\"omnis laborum o" +
            "dio\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\n    \\" +
            "\"id\\\": 4,\\r\\n    \\\"title\\\": \\\"non esse culpa molestiae " +
            "omnis sed optio\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1," +
            "\\r\\n    \\\"id\\\": 5,\\r\\n    \\\"title\\\": \\\"eaque aut omn" +
            "is a\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\n    \\" +
            "\"id\\\": 6,\\r\\n    \\\"title\\\": \\\"natus impedit quibusdam i" +
            "llo est\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\n    \\\"id\\\": 7,\\r\\n    \\\"title\\\": \\\"quibusdam autem aliquid et et quia\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\n    \\\"id\\\": 8,\\r\\n    \\\"title\\\": \\\"qui fuga est a eum\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\n    \\\"id\\\": 9,\\r\\n    \\\"title\\\": \\\"saepe unde necessitatibus rem\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 1,\\r\\n    \\\"id\\\": 10,\\r\\n    \\\"title\\\": \\\"distinctio laborum qui\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 11,\\r\\n    \\\"title\\\": \\\"quam nostrum impedit mollitia quod et dolor\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 12,\\r\\n    \\\"title\\\": \\\"consequatur autem doloribus natus consectetur\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 13,\\r\\n    \\\"title\\\": \\\"ab rerum non rerum consequatur ut ea unde\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 14,\\r\\n    \\\"title\\\": \\\"ducimus molestias eos animi atque nihil\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 15,\\r\\n    \\\"title\\\": \\\"ut pariatur rerum ipsum natus repellendus praesentium\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 16,\\r\\n    \\\"title\\\": \\\"voluptatem aut maxime inventore autem magnam atque repellat\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 17,\\r\\n    \\\"title\\\": \\\"aut minima voluptatem ut velit\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 18,\\r\\n    \\\"title\\\": \\\"nesciunt quia et doloremque\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 19,\\r\\n    \\\"title\\\": \\\"velit pariatur quaerat similique libero omnis quia\\\"\\r\\n  },\\r\\n  {\\r\\n    \\\"userId\\\": 2,\\r\\n    \\\"id\\\": 20,\\r\\n    \\\"title\\\": \\\"voluptas rerum iure ut enim\\\"\\r\\n  }\\r\\n]";
}
