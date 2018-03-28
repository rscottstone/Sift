2.0 (2018-03-28)
=================

- Add content level decisions in ApplyDecisionFieldSet.java.
- Add support for V205 content events
- Removed support for send message and submit review events.
- Add support for filtering get decisions by entity type SESSION.


1.5 (2018-02-09)
=================

- Add session level decisions in ApplyDecisionFieldSet.java.
- Add support for filtering get decisions by entity type SESSION.
- Add support for $security_notification event.

1.4.1 (2017-10-25)
=================

- Fix typo in ApplyDecisionFieldSet.java.
- Throw a ServerException for all 5xx server responses.

1.4 (2017-02-28)
=================

- Add support for $verification event.
- Add support for $app and $browser complex fields.

1.3.1 (2017-01-26)
==================

- Make base model classes public.
- Packaging with "jar" instead of "pom".

1.3 (2017-01-17)
==================

- Add support for decisions API.

1.2 (2016-12-14)
==================

- Initial public release.
